public class Livro {
private     String altor ;
 private    String genero ;
 private    int ano ;
 private    String tituloDoLivro;

    public Livro (){

    }
    public Livro (String altor , String genero , String tituloDoLivro, int ano){
        this.altor = altor;
        this.genero = genero;
        this.tituloDoLivro = tituloDoLivro;
        this.ano = ano;

    }
    public void inprimi ( ) {
        System.out.println(" nome do altor " + this.altor);
        System.out.println(" nome genero " + this.genero);
        System.out.println(" nome titulo " + this.tituloDoLivro);
        System.out.println(" nome ano " + this.ano);
    }
    }







