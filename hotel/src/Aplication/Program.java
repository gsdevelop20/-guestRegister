package Aplication;

import java.util.Scanner;

import entities.Cadastro;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Cadastro[] hospedes = new Cadastro[10];
		
		System.out.println("How many rooms will be rented?");
		int n = sc.nextInt();
		
	
		for (int i = 1; i<=n;i++) {
			sc.nextLine();
			System.out.println("Rent #"+i);
			
			System.out.println("Name:");
			String name = sc.nextLine();
			System.out.println("Email:");
			String email = sc.nextLine();
			System.out.println("Rom:");
			int room = sc.nextInt();
			
			hospedes[room] = new Cadastro(name, email);
			
			System.out.println("");
			
			
		}
		
		System.out.println("Busy rooms:");
		
		for (int i = 0; i < 10; i++ ) {
			if (hospedes[i] != null) {
				System.out.println(i + ": " + hospedes[i].getName() + ", " + hospedes[i].getEmail() );
			}
		}
		
		
				
		
		sc.close();
		

	}

}
