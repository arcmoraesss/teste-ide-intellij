package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gato = new Gato ();
        System.out.println(gato);

        Livro livro1 = new Livro("O problema dos 3 corpos ", 300);
        System.out.println(livro1);
        /*int a = 5;
        int b = 3;
        System.out.println("Hello World!");*/
    }
}
class Livro {
    private String nome;
    private Integer mumPaginas;

    public Livro(String nome, Integer mumPaginas) {
        this.nome = nome;
        this.mumPaginas = mumPaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getMumPaginas() {
        return mumPaginas;
    }

    public void setMumPaginas(Integer mumPaginas) {
        this.mumPaginas = mumPaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", mumPaginas=" + mumPaginas +
                '}';
    }
}