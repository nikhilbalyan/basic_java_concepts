package main;

import java.sql.SQLException;
import java.util.Scanner;

import jdbc_connectivity.EmployeeDAO;

public class EmployeeDatabaseClient {
	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		int t;
		String name;
		String phone;
		String address;
		String department;
		EmployeeDAO empl = new EmployeeDAO();
		while (true) {
			System.out.println("enter -1 to break");
			System.out.println("enter 1 to add employee to database");
			System.out.println("enter 2 to search on the basis of :- phone"
					+ "\n enter 3 to search on the name"
					+ "\n enter 4 to search on the phone"
					+ "\n enter 5 to search on the address"
					+ "\n enter 6 to search on the department");
			t = sc.nextInt();
			if (t == -1) {
				break;
			}
			switch (t) {
			case 1:
				System.out.println("enter name");
				name = sc.next();
				System.out.println("enter phone number");
				phone = sc.next();
				System.out.println("enter the address");
				address = sc.next();
				System.out.println("enter the department");
				department = sc.next();
				
				empl.addEmployee(name, phone, address, department);
				break;
			case 2:
				phone = sc.next();
				empl.searchItem("phone", phone);
				break;
			case 3:
				name = sc.next();
				empl.searchItem("name", name);
				break;
			case 4:
				phone = sc.next();
				empl.searchItem("phone", phone);
				break;
			case 5:
				address = sc.next();
				empl.searchItem("address", address);
				break;
			case 6:
				department = sc.next();
				empl.searchItem("department", department);
				break;
			default:
				System.out.println("you entered the wrong option");
				break;
			}
		}
		sc.close();
	}
}
