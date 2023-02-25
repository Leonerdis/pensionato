package aplicacao;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import entidades.locatarios;

public class programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> lista = new ArrayList<>();
		locatarios[] vect = new locatarios[10];
		System.out.print("Quantos quartos serão alugados? ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Aluguel #" + i + ":");
			System.out.print("Nome Completo: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			
			System.out.print("Quarto: ");
			int room = sc.nextInt();
			
			vect[room] = new locatarios(name, email);
		}
		System.out.println();
		System.out.println("Busy rooms:");
		for (int i = 0; i < 10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}
		
		sc.close();
		
	}
	
	
	

}
