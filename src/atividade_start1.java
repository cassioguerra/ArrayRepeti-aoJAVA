import java.util.Scanner;
import java.util.Stack;

public class atividade_start1 {
    public static void main(String[] args) {
        Scanner LEIA = new Scanner(System.in);
        Double numero1 , nuemero2 ;
        System.out.println(" digite numero 1 ");
        numero1 = LEIA.nextDouble();
        System.out.println( " digite numero 2 ");
        nuemero2 = LEIA.nextDouble();
        System.out.println( " soma " + ( numero1 + nuemero2 ));
        System.out.println( " SUBTRAÇÃO " + (numero1 - nuemero2));
        System.out.println( " MUTIPLICAÇÃO  " + ( nuemero2 * numero1));
        System.out.println( " DIVIÇÃO  " + (numero1 / nuemero2));

    }
}
