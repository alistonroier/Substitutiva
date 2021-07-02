
package entidades;

public class Autor {
    
    private String autor;
    
    public Autor(){
    }
    
    public Autor(String nome) {
        this.autor = nome;
    }
    
    public String getAutor() {
        autor = "MANESKIN";
        return autor;
    }
    
    public void seAutor(String autor){
        this.autor = autor;
    }
        
}
