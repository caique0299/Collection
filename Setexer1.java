package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Setexer1 {

public static void main(String[] args) {
        
        // Criação do Set de inteiros
        Set<Integer> conjuntoInteiros = new HashSet<>();
        
        // Leitura dos inteiros digitados pelo usuário
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o inteiro " + i + ": ");
            int inteiro = scanner.nextInt();
            conjuntoInteiros.add(inteiro);
        }
        
        // Exibição dos inteiros utilizando a Classe Iterator
        System.out.println("\nListar dados do Set:");
        Iterator<Integer> iterator = conjuntoInteiros.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
