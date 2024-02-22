import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner teclado = new Scanner(System.in);
        
        ArrayList<String> listaNomes = new ArrayList<String>();

        System.out.println("Digite a quantidade de nomes: ");
        int n = teclado.nextInt();
        String nome;

        for(int i= 0; i<n; i++) {
            nome = teclado.next();
            listaNomes.add(nome);
        }

        /*
        for(int i=listaNomes.size()-1;i>=0;i--) {
            System.out.println(listaNomes.get(i));
        }
        */
        Collections.reverse(listaNomes);
        System.out.println(listaNomes);
        teclado.close();
        
    }

}