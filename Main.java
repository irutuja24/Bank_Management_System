package Bank_Management_System;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Account ac = new Account();
		boolean condition = true;
		while (condition == true) {
			System.out.println("-----------------------");
			System.out.println("1.Open new account");
			System.out.println("2.Show All Bank Account");

			System.out.println("3.Exit");

			int key = sc.nextInt();

			switch (key) {
			case 1:
				ac.Creatacc();
				break;
			case 2:
				ac.ShowDetails();
				break;
			case 3:
				sc.close();
				condition = false;
				break;

			default:
				System.out.println("Enter Valid Option");
				break;
			}

		}
	}

}
