public class vetor1 {
    public static void main(String[] args) {
        int[] cassio = {12 , 15, 54, -9,  -45 }; // criação do array
       int i = 0;
       // declaração do array
        while ( i < (cassio.length)  ) {
            System.out.print(cassio [i]);
            i++;
        }
        System.out.println( " \narray for " ); // os array for de tras para frente
        for ( i = cassio.length -1; i >= 0; i-- ){
            System.out.print(cassio[i]);
        }















    }
}
