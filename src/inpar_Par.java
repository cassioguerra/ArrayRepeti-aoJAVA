import java.util.Scanner;

public class inpar_Par {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         int numero ;
         int contador = 0;
         int quantidade ;
         int quantidadeinpar =0 , quntidadepar=0;

        System.out.println( " qauntidade de vezes a se feito ");
        quantidade = scan.nextInt();


         do {
             System.out.println( " numero ");
             numero = scan.nextInt();
             if (numero %2 == 0) quntidadepar++;
             else quantidadeinpar++;

             contador++;

         } while ( contador < quantidade);
        System.out.println( " ja foram toda tentativas  ");
        System.out.println(" quantidade de par " +quntidadepar);
        System.out.println("qauntidade de ipar " +quantidadeinpar);
    }}

