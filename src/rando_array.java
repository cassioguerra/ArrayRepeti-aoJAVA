import java.util.Random;

public class rando_array {
    public static void main(String[] args) {
        Random random = new Random();
        int [] numerosaleatorio = new int[10];

        for (int i = 0 ; i < numerosaleatorio.length; i ++){
            int numero = random.nextInt(20);
            numerosaleatorio[i] = numero;
        }
        System.out.print( " NUMERO ALEATORIO :");
        for ( int numero : numerosaleatorio) {
            System.out.print(numero+ " ");
        }
        System.out.print( "  \n o dobro do numero : ");

        for ( int numero : numerosaleatorio) {
            System.out.print( (numero * numero)+ " " );
        }
    }
}
