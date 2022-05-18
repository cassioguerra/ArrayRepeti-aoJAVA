import java.util.Scanner;

public class atividadeStart2 {
    public static void main(String[] args) {
        Scanner Leia = new Scanner(System.in);
        Double distanciaPercorrida, consumoCombustivel;
        System.out.println("Digite o valor do combustível:");
        System.out.println("Digite a distância percorrida:");
        distanciaPercorrida = Leia.nextDouble();
        consumoCombustivel = Leia.nextDouble();
        System.out.println("Média:" + (distanciaPercorrida/consumoCombustivel));
    }
}
