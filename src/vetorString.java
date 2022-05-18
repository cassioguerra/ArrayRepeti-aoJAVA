import java.util.Scanner;

public class vetorString {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] consoantes = new  String[6];
        int i = 0;
        int quantidade  = 0;
        do {
            System.out.print(" LETRA ");
            String letra = scan.next();
            if (!(letra.equalsIgnoreCase("a") |
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u"))) {
                consoantes[i] = letra;
                quantidade++;
            }
            i++;
        }
            while (i > consoantes.length);

        for ( String consoante  : consoantes
             ) {
           if (consoante != null){
               System.out.println( consoante + " ");
           }
            System.out.println( quantidade );

          }

        }
        }


