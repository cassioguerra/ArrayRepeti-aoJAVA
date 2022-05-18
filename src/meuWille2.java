import java.util.Scanner;

public class meuWille2 {
    public static void main(String[] args) {
        Scanner nota = new Scanner(System.in);

        int nota1;
        while (true){
            System.out.println("  digite sua nota ") ;
            nota1 = nota.nextInt();
if (nota1 < 0 || nota1 > 10){
    System.out.println("sua nota não esta conpativel , tente um numero valido ");
}

        }
    }
}
