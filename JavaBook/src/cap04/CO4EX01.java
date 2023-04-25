package cap04;

import java.io.*;

public class CO4EX01 {

	public static void main(String[] args) {
		
		String nome;
		int idade;
		float altura;
		
		System.out.println("Digite seu nome: ");
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
			nome = br.readLine();
		} catch (Exception e){
			nome = "";
		}
		
		System.out.println("Digite sua idade: ");
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
			idade = Integer.parseInt(br.readLine());
		} catch (Exception e) {
			idade = 0;
		}
		
		System.out.println("Digite sua altura: ");
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
			altura = Float.parseFloat(br.readLine());
		} catch (Exception e) {
			altura = 0;
		}
		
		System.out.println();
		System.out.print("Nome: " + nome);
		System.out.print("\nIdade: " + idade);
		System.out.print("\nAltura: " + altura);
		System.out.println();
	}

}
