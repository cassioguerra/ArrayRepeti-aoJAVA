import java.util.Random;

public class arrybistring {
    public static void main(String[] args) {
        Random random = new Random();
        String [][][] nomeSalario= new String[2][2][2];
        for (int i = 0; i < nomeSalario.length ; i++) {
            for (int j = 0; j < nomeSalario[i].length; j++) {
                for (int k = 0; k < nomeSalario[i][j].length; k++) {
                     nomeSalario [i][j][k] = random.toString();
                }

            }

        }
        System.out.println( " matriz de salario " + "");
        for (String[][] linha :nomeSalario) {
            System.out.println();
            for (String [] coluna : linha ) {
                System.out.println();
                for (String kk:coluna) {
                    System.out.print(kk);

                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
