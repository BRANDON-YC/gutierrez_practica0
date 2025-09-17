package Java;
public class libro {
    private String titulo;
    private String autor;
    private int año;


    public libro(String titulo, String autor, int año) {
        this.titulo = titulo;
        this.autor = autor;
        this.año = año;
    }

     public void mostrarInfo() {
        System.out.println("Título: " + titulo + " | Autor: " + autor + " | Año: " + año);
    }
}
    
