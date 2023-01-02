package com.view;

import java.sql.SQLException;
import java.util.Scanner;
import com.service.HostService;



public class HostMain {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("Hospital Managment System:");
		System.out.println("1.Display ALL patient Data");
		System.out.println("2.Display ALL Doctor Data");
		System.out.println("3.insert ALL patient Data");
		System.out.println("4.Update ALL patient Data");
		System.out.println("5.Delete ALL patient Data");
		String s;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter your choice:");
			int choice=sc.nextInt();
			switch(choice)
			{
				case 1:
					new HostService().displayAll1();
					break;
				case 2:
					new HostService().displayAll();
					break;
				case 3:
					new HostService().insertData();
					break;
				case 4:
					new HostService().updateData();
					break;
				case 5:
					new HostService().DeleteData();
					break;
			}
			System.out.println("Do you want to continue:");
			s = sc.next();
		}
			while(s.equals("yes"));
		}

}

