package com.company;


import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        DatabaseFunctions db = new DatabaseFunctions();
        Connection conn = db.connect_to_db("postgres", "postgres", "postgres!Test");

        db.createTable(conn, "employee");
        db.insert_row(conn, "table_Name", "employee_Name", "employee_Address");
        db.update_name(conn, "employee", "old_Name", "new_Name");
        db.search_by_name(conn, "employee", "employee_Name");
        db.search_by_id(conn, "employee", 0);
        db.delete_row_by_name(conn, "employee", "employee_Name");
        db.delete_row_by_id(conn, "employee", 0);
        db.deleteTable(conn, "employee");
        db.read_data(conn, "employee");

    }

}
