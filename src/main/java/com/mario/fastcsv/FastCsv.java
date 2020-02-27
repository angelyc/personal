package com.mario.test.fastcsv;

import com.google.gson.Gson;
import de.siegmar.fastcsv.reader.CsvContainer;
import de.siegmar.fastcsv.reader.CsvReader;
import de.siegmar.fastcsv.reader.CsvRow;

import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;

public class FastCsv {
    private static String PATH = "E:\\项目资料\\西子电梯\\数据采集资料\\日东\\日东回流焊\\ParameterMsg\\20190619.txt";
    Map<Integer, String> result = new HashMap<>();
    public void run() {
        boolean bResult = true;

        File file = new File(PATH);
        if (!file.isFile() || !file.canRead()) {
            System.out.println(PATH + " is not a file or can't read.");
            return;
        }
        Charset charset = Charset.forName("GB2312");
        CsvReader csvReader = new CsvReader();
        try {
            csvReader.setContainsHeader(false);
            csvReader.setSkipEmptyRows(false);

            System.out.println("begin reading file " + PATH);
            CsvContainer csv = csvReader.read(file, charset);
            Map<Integer, String> columnIndex = getColumnNumbers(csv);

            for (int index = 0; index < 10; index++) {
                CsvRow row = csv.getRow(index);
                System.out.println("line number: " + row.getOriginalLineNumber() + "count: " + buildLineInfo(row, columnIndex) + ", index:" + index);
                result.put(result.size(), buildLineInfo(row, columnIndex));
            }

        } catch (IOException e) {
            System.out.println("read file error:" + e.toString());
        }
        System.out.println("Get " + result.size() + " lines from " + PATH);
        return;
    }

    private Map<Integer, String> getColumnNumbers(CsvContainer csv) {
        Map<Integer, String> columnIndex = new HashMap<>();

        for (int i = 0; i < csv.getHeader().size(); i++) {
            columnIndex.put(i, csv.getHeader().get(i));
        }

        return columnIndex;
    }

    private String buildLineInfo(CsvRow row, Map<Integer, String> columnIndex) {
        Map<String, String> result = new HashMap<>();
        Gson gson = new Gson();
        for (Map.Entry<Integer, String> entry : columnIndex.entrySet()) {
            result.put(entry.getValue(), row.getFieldCount() > entry.getKey() ? row.getField(entry.getKey()) : "");
        }

        return gson.toJson(result);
    }
}
