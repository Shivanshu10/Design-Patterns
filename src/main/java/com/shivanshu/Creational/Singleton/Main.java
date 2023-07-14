package com.shivanshu.Creational.Singleton;

public class Main {
    public static void main(String[] args) {
        Database db = Database.getDatabase();

        db.query("sql query");
    }
}
