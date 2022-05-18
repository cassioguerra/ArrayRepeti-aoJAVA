import java.util.Scanner;

public class mediaDoWill {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;
        int maior = 0;
        int contador = 0;
        int soma = 0;



        do {
            System.out.println("numero :");
            numero = scan.nextInt();
            soma = numero + soma ;
            if (numero > maior ) maior = numero;
            contador = contador +1;
        }while (contador < 5 );
        System.out.println(" maior numero " + maior );
        System.out.println(" media " + (soma / 5));
    }

}
