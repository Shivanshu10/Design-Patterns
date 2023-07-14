package com.shivanshu.Creational.Singleton;

public class Database {
    private static Database db;

    private Database() {
        System.out.println("Setting up database");
    }

    public static Database getDatabase() {
        if (db == null) {
            db = new Database();
        }
        return db;
    }

    public String query(String sqlQuery) {
        System.out.println("Executing Query");
        return "result of query";
    }
}
