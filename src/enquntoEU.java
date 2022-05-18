import java.util.Scanner;

public class enquntoEU {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String  nome;
        int idade ;

        while (true){
            System.out.println("digite sue nome " );
            nome = scan.next();
            if (nome.equals("0")){
                System.out.println(" nome invalido ");break;
            }
            System.out.println("digite sa idade ");
            idade = scan.nextInt();
            System.out.println( " sua nome é : " +  nome + " e sua idade é de:" + "\n" + idade);

}
        System.out.println(" seu nome não pode ser zero " );




}}