package Java;
public class alumno {
    private String nombre;
    private int nota;

    
    public alumno(String nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;
    }


    
    /* 
    public String getNombre() { return nombre; }
    public int getNota() { return nota; }
    */

    public String getNombre() {
        return nombre;
    }



    public int getNota() {
        return nota;
    }



    @Override
    public String toString() {
        return "alumno [nombre=" + nombre + ", nota=" + nota + "]";
    }



    /*
    @Override
    public String toString() {
        return nombre + " (" + nota + ")";
    }
         */
}
