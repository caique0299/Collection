package Collection;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Setexer2 {

	 public static void main(String[] args) {
	        // Inicializa o Set com 10 valores inteiros
	        Set<Integer> numeros = new HashSet<>();
	        numeros.add(2);
	        numeros.add(5);
	        numeros.add(1);
	        numeros.add(3);
	        numeros.add(4);
	        numeros.add(9);
	        numeros.add(7);
	        numeros.add(8);
	        numeros.add(10);
	        numeros.add(6);
	        
	        // Imprime a lista de números do Set
	        System.out.println("Lista de números do Set:");
	        for (int num : numeros) {
	            System.out.println(num);
	        }
	        
	        // Solicita ao usuário um número para buscar no Set
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Digite o número que você deseja encontrar: ");
	        int numero = sc.nextInt();
	        
	        // Verifica se o número está no Set e exibe a mensagem correspondente
	        if (numeros.contains(numero)) {
	            System.out.printf("Número %d encontrado!\n", numero);
	        } else {
	            System.out.printf("O número %d não foi encontrado!\n", numero);
	        }
	        
	        sc.close();
	    }
	}
