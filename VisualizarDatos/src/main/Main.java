package main;

import java.sql.SQLException;

import campusfp.conexiondatos.ConexionDatos;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ConexionDatos.getDataTable("actor");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
