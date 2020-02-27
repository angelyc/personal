package com.mario.test.xiziproject;

import de.siegmar.fastcsv.reader.CsvContainer;
import de.siegmar.fastcsv.reader.CsvReader;
import jcifs.smb.NtlmPasswordAuthentication;
import jcifs.smb.SmbException;
import jcifs.smb.SmbFile;
import jcifs.smb.SmbFileFilter;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.*;
import java.net.MalformedURLException;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SambaTest {
    public static final Logger logger = Logger.getLogger("SambaClient");
    public static final String SUN_EAST = "smb://10.15.52.12/MachineMsg/ParameterMsg/";
    public static final String NPM = "smb://10.15.15.7/othersystem/iLNBIF/HOSTIF/iLNBtoHOST/NPM-1/";
    private NtlmPasswordAuthentication authentication;
    public void run() {
        //npm();
        suneast();
    }
    private void npm() {
        ProductInfoFilter productInfoFilter = new ProductInfoFilter();
        samba(productInfoFilter, SUN_EAST);
    }
    private void suneast() {
        SuneastFilter suneastFilter = new SuneastFilter();
        samba(suneastFilter, SUN_EAST);
    }
    private void samba(SmbFileFilter fileFilter, String url) {
        String canonical = "";
        setAuthentication(new NtlmPasswordAuthentication(null, null, null));
        try {
            SmbFile file = new SmbFile(url, getAuthentication());
            canonical = file.getCanonicalPath();
            if (file.exists()){
                SmbFile[] files = file.listFiles(fileFilter);
                for (SmbFile smbFile : files){
                    logger.log(Level.INFO, "List file ：" + smbFile.getName());
                    CsvReader csvReader = new CsvReader();
                    Reader reader = new InputStreamReader(smbFile.getInputStream(), Charset.forName("GB2312"));
                    csvReader.setContainsHeader(true);
                    csvReader.setSkipEmptyRows(false);
                    CsvContainer csv = csvReader.read(reader);
                    logger.log(Level.INFO, "List header ：" + csv.getHeader());
                    logger.log(Level.INFO, "Row count：" + csv.getRowCount());
                }
            }
        } catch (MalformedURLException e) {
            logger.log(Level.INFO,"Cannot connect to : " + url + " " + e.getMessage());
        } catch (SmbException se) {
            logger.log(Level.INFO, se.getMessage() + "::::::" + canonical);
        } catch (IOException ioe) {
            logger.log(Level.INFO, ioe.getMessage() + "::::::" + canonical);
        }
    }
    public void setAuthentication(NtlmPasswordAuthentication authentication) {
        this.authentication = authentication;
    }
    public NtlmPasswordAuthentication getAuthentication() {
        return authentication;
    }
    class ProductInfoFilter implements SmbFileFilter {
        public boolean accept(SmbFile var1) {
            return var1.getName().endsWith("Product_Info.inf");
        }
    }
    class SuneastFilter implements SmbFileFilter {
        public boolean accept(SmbFile var1) {
            return var1.getName().endsWith(".txt");
        }
    }
    private void getProductInfo(Integer deviceId, SmbFile file) {
        Element ele = useDom4JReadXml(file);
        Element productInfo = ele.element("ProductInfo");
        //long acquisitionTime = getFileTime(file.getName());
        // 采集CTime2
        Element cycleTime = productInfo.element("CycleTime");

        logger.log(Level.INFO, file.getName() + ", CTime2: " + cycleTime.attributeValue("CTime2"));

        // 采集各物料的抛料率
        Element mountPickupFeeder = productInfo.element("MountPickupFeeder");
        Element foo;
        for (Iterator i = mountPickupFeeder.elementIterator("MountPickupFeederData"); i.hasNext(); ) {
            foo = (Element) i.next();
            String [] pms = foo.getText().split(" ");

            Float getNumber = Float.valueOf(pms[8]);
            Float pasteNumber = Float.valueOf(pms[15]);
            Float rejectRate = (getNumber - pasteNumber) / getNumber;
            logger.log(Level.INFO, file.getName() + ", rejectRate: " + rejectRate + "    " + file.getLastModified());
        }

        return;
    }
    private Element useDom4JReadXml(SmbFile file) {
        try {
            SAXReader read = new SAXReader();

            org.dom4j.Document doc = read.read(file.getInputStream());
            Element root = doc.getRootElement();
            return root;
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }
}
