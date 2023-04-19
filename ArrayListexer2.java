package Collection;

import java.util.ArrayList;
	import java.util.Scanner;
	
	public class ArrayListexer2 {

	    public static void main(String[] args) {
	        
	        // Criação e inicialização do ArrayList com 10 valores inteiros
	        ArrayList<Integer> listaNumeros = new ArrayList<>();
	        listaNumeros.add(2);
	        listaNumeros.add(5);
	        listaNumeros.add(1);
	        listaNumeros.add(3);
	        listaNumeros.add(4);
	        listaNumeros.add(9);
	        listaNumeros.add(7);
	        listaNumeros.add(8);
	        listaNumeros.add(10);
	        listaNumeros.add(6);
	        
	        // Leitura do número a ser buscado pelo usuário
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Digite o número que você deseja encontrar: ");
	        int numeroBuscado = scanner.nextInt();
	        
	        // Busca pelo número na lista e exibição da posição ou mensagem de não encontrado
	        int posicao = -1;
	        for (int i = 0; i < listaNumeros.size(); i++) {
	            if (listaNumeros.get(i) == numeroBuscado) {
	                posicao = i;
	                break;
	            }
	        }
	        if (posicao != -1) {
	            System.out.println("O número " + numeroBuscado + " está localizado na posição: " + posicao);
	        } else {
	            System.out.println("O número " + numeroBuscado + " não foi encontrado!");
	        }
	    }
	}
	
