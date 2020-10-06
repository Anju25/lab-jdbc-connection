package controller;

import java.sql.Connection;
import java.sql.SQLException;

import utility.ConnectionManager;

public class Main {
	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		
	Connection con=ConnectionManager.getConnection();
	if(con!=null)
	{
		System.out.println("```Connection Established.```");
	}
	else
	{
		System.out.println("```Check Your Connection.```");
	}
	}
}
