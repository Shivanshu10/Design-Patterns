package com.shivanshu.Structural.Decorator;

import javax.xml.crypto.Data;
import java.io.File;

public class FileDataSource implements DataSource {
    private String fileName;

    public FileDataSource(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void writeData(String data) {
        System.out.println("Writing "+data+" to File "+fileName);
    }

    @Override
    public String readData() {
        System.out.println("Reading from File: "+fileName);
        return "";
    }
}
