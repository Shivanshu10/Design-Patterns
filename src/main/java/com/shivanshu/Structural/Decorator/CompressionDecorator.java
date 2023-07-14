package com.shivanshu.Structural.Decorator;

public class CompressionDecorator extends DataSourceDecorator {
    public CompressionDecorator(DataSource wrapee) {
        super(wrapee);
    }

    public void writeData(String data) {
        System.out.println("Decompressing got data");
        super.writeData(data);
    }

    public String readData() {
        String data = super.readData();
        System.out.println("Decompressing read data");
        return data;
    }
}
