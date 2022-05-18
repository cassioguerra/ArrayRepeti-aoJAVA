import java.util.Scanner;

public class meu_enquntoWille {
    public static void main(String[] args) {
        Scanner senha = new Scanner(System.in);
        String  nome , nome2;
        while (true){
            System.out.println(" nome  do usuario ");
            nome = senha.next();

            System.out.println(" digite sua senha");
            nome2 = senha.next();

            if (nome2.equals(nome)){
                System.out.println(" seu senha não pode ser igual a seu nome ");
            } else if (nome != nome2){
                System.out.println(" senha confirmada ...");break;
            }
        }








    }
}
