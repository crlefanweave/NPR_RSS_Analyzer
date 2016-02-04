package edu.bsu.cs222.nprrssanalyzer;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.*;

/**
 * Created by Cody on 2/4/2016.
 */
public class textFromFileAnalyzer {
    private InputStream inputStream;

    @Before
    public void setUp(){
        ClassLoader classLoader = getClass().getClassLoader();
        inputStream = classLoader.getResourceAsStream("textsample.txt");
    }

    @Test
    public void testAccessedFileIsNotEmpty() throws IOException {
        inputStream.read();
    }

    @Test
    public void testGetResourceAsStream_contentIsAsExpected() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        String line = reader.readLine();
        Assert.assertEquals("banana apple", line);
    }
}
