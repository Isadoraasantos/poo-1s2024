package Livraria;

public class Livro {
    public int id;
    public String titulo;
    public String nomeAutor;
    public String anoPublicaco;
    public String editora;

    public Livro(int id, String titulo, String nomeAutor, String anoPublicacao, String editora){
        this.id = id;
        this.titulo = titulo;
        this.nomeAutor = nomeAutor;
        this.anoPublicaco = anoPublicacao;
        this.editora = editora;

    }
}
