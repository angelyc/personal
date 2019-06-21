package com.mario.test;


import com.mario.test.fastcsv.FastCsv;
import com.mario.test.labmda.Lambda;
import com.mario.test.xiziproject.SambaTest;
import jcifs.smb.NtlmPasswordAuthentication;
import jcifs.smb.SmbException;
import jcifs.smb.SmbFile;
import jcifs.smb.SmbFileFilter;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;

import java.util.logging.Logger;
@SpringBootApplication
public class TestApplication {
    public static final Logger logger = Logger.getLogger("SambaClient");
    private static NtlmPasswordAuthentication authentication;
    public static void main(String[] args) {
        //SpringApplication.run(TestApplication.class, args);
        //testXiziSamba();
        //testLambda();
        testFastCsv();
    }
    public static void testXiziSamba(){
        SambaTest sambaTest = new SambaTest();
        sambaTest.run();
    }
    public static void testLambda(){
        Lambda lambda = new Lambda();
        lambda.run();
    }
    public static void testFastCsv(){
        FastCsv fastCsv = new FastCsv();
        fastCsv.run();
    }

}
