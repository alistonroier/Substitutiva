
package entidades;


public final class Musica {
    
    public String nome;
    private int duracao;
    private Autor autor;
    private String genero;
    private String displayMusica;
    
    Autor aut = new Autor();
        
    public Musica(){
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    
    public String getGenero(){
        return this.genero;
    }
    
    public void setGenero(String genero){
        this.genero = genero;
    }
    
    public String getMusica1(){
        nome = "BEGGIN ";
        genero = "ROCK ";
        this.displayMusica = nome+genero+aut.getAutor();        
        return this.displayMusica;
    }

    public void setMusica1(String displayMusica){
        this.displayMusica = nome;
    }
    public String getMusica2(){
        nome = "CAROLINE ";
        genero = "ROCK ";
        this.displayMusica = nome+genero+aut.getAutor();        
        return this.displayMusica;
    }

    public void setMusica2(String displayMusica){
        this.displayMusica = nome;
    }
    
}
