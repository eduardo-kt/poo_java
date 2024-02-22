package empresa;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        int peso;
        double altura;

        Scanner teclado = new Scanner(System.in);

        System.out.println(("Digite o peso e a altura: "));
        
        peso = teclado.nextInt();
        altura = teclado.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("IMC: "+ imc);



        
    }
}
