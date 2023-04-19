package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListexer1 {

	 public static void main(String[] args) {
	        
	        
	        ArrayList<String> listaCores = new ArrayList<>();
	        
	     
	        Scanner scanner = new Scanner(System.in);
	        for (int i = 1; i <= 5; i++) {
	            System.out.print("Digite a cor " + i + ": ");
	            String cor = scanner.nextLine();
	            listaCores.add(cor);
	        }
	        
	        
	        System.out.println("\nListar todas as cores:");
	        for (String cor : listaCores) {
	            System.out.println(cor);
	        }
	        
	       
	        Collections.sort(listaCores);
	        
	      
	        System.out.println("\nOrdenar as cores:");
	        for (String cor : listaCores) {
	            System.out.println(cor);
	        }
	    }

	}