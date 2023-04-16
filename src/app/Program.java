package app;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;
import exception.BusinessException;

public class Program {

	public static void main(String[] args) {
		

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe os dados da conta");
		System.out.print("Numero: ");
		int number = sc.nextInt();
		System.out.print("Titular: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Saldo inicial: ");
		double balance = sc.nextDouble();
		System.out.print("Limite de saque: ");
		double withdrawLimit = sc.nextDouble();

		Conta acc = new Conta(number, holder, balance, withdrawLimit);
		
		System.out.println();
		System.out.print("Informe uma quantia para sacar: ");
		double amount = sc.nextDouble();
		
		try {
			acc.withdraw(amount);
			System.out.println("Seu novo saldo é: " + acc.getBalance());
		}
		catch (BusinessException e) {
			System.out.println(e.getMessage());
		}
			
		
		
		
		sc.close();
		
		
		
		
		


	}

}
