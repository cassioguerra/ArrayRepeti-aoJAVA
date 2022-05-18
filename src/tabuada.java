import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in);
        int numero ;
        int tabuada ;
        System.out.println( " numero :");
        numero = scan.nextInt();
        System.out.println( " a tabuade de "+ numero + " :");
        // calculado
        for (tabuada = 0 ; tabuada <= 10 ; tabuada = tabuada +1){
            System.out.println( numero +" x"+ tabuada +" = "+ (numero * tabuada));
        }


    }


}
