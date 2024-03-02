package empresa;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        int idade = 10;

        String nome = "Mario";
        double peso = 72.5;
        

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite idade, peso e nome: ");

        idade = teclado.nextInt();
        peso = teclado.nextDouble();
        nome = teclado.next();

        System.out.println();

        System.out.println("Nome: " + nome);
        System.out.printf("Peso: %.2f", peso);
        System.out.printf("Idade: %d", idade);
        
        
    }
    
}
