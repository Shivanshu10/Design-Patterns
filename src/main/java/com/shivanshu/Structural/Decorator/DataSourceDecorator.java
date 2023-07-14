package com.shivanshu.Structural.Decorator;

public class DataSourceDecorator implements DataSource {
    DataSource wrapee;

    public DataSourceDecorator(DataSource wrapee) {
        this.wrapee = wrapee;
    }

    @Override
    public void writeData(String data) {
        wrapee.writeData(data);
    }

    @Override
    public String readData() {
        return wrapee.readData();
    }
}
