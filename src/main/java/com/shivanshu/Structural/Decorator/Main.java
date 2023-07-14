package com.shivanshu.Structural.Decorator;

public class Main {
    public static void main(String[] args) {
        DataSource source = new FileDataSource("somefile.txt");
        source.writeData("hello");

        source = new CompressionDecorator(source);
        source.writeData("hello");

        source = new EncryptionDecorator(source);
        source.writeData("hello");
    }
}
