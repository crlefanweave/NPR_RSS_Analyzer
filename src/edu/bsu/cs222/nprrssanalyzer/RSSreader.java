package edu.bsu.cs222.nprrssanalyzer;

import java.io.*;
import java.net.*;

public class RSSreader {
    public String readRss(String url) throws IOException {
        URL rssURL = new URL(url);
        BufferedReader inputReader = new BufferedReader(new InputStreamReader(rssURL.openStream()));
        inputReader.close();
        String srcCode = "";
        String line;
        while((line = inputReader.readLine()) != null){

        }
        return srcCode;
    }
}
