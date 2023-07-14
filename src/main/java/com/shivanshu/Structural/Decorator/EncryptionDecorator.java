package com.shivanshu.Structural.Decorator;

public class EncryptionDecorator extends DataSourceDecorator {
    public EncryptionDecorator(DataSource wrapee) {
        super(wrapee);
    }
    public void writeData(String data) {
        System.out.println("Encrypting passed data: "+data);
        super.writeData(data);
    }
    public String readData() {
        String data = super.readData();
        System.out.println("Decrypting read data");
        return data;
    }
}
