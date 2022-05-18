import java.util.Scanner;

public class fatoracao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" digite o numero que vocer quer fatorar ");
        int numero = scan.nextInt();

        int mutiplicacao=1;

        System.out.println( numero + " ! = ");
        for (int i = numero ; i >=0 ; i--){

             mutiplicacao= i * mutiplicacao;
            System.out.println( mutiplicacao);
             }

        }
    }



