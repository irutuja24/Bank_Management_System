package Bank_Management_System;

import java.util.*;

public class Account {
	Set<Customers> a1 = new HashSet<>();

	public void Creatacc() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Acc no");
		int accno = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name");
		String name = sc.nextLine();
		System.out.println("Enter Email");
		String email = sc.nextLine();
		System.out.println("Enter mobile no");
		int mobile = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter PANNo no");
		String PanNo = sc.nextLine();
		System.out.println("Enter opeingbal");
		double openingbal = sc.nextDouble();
		a1.add(new Customers(accno, name, email, mobile, PanNo, openingbal));
		System.out.println("Account create sucessfully");

	}
    
	
	public void ShowDetails() {
		for (Customers customers : a1) {
			System.out.println(customers.toString());
			
		}
		
	}
}
