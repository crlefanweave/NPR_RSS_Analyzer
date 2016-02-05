package edu.bsu.cs222.nprrssanalyzer;

import java.io.*;
import java.net.*;

public class RSSreader {
    public String readRss(String url) throws IOException {
        URL rssURL = new URL(url);
        BufferedReader inputReader = new BufferedReader(new InputStreamReader(rssURL.openStream()));
        String srcCode = "";
        String currentLine;
        while((currentLine = inputReader.readLine()) != null) {
            if (currentLine.contains("<title>")) {
                System.out.println(currentLine);
                int initialPosition = currentLine.indexOf("<title>");
                String temporaryString = currentLine.substring(initialPosition);
                temporaryString.replace("<title>", "");
                int finalPosition = temporaryString.indexOf("</title>");
                temporaryString = temporaryString.substring(0, finalPosition);
                srcCode += temporaryString + "\n";
            }
        }
        inputReader.close();
        return srcCode;
    }
}
