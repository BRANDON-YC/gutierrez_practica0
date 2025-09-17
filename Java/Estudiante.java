package Java;
public class Estudiante {
    String nombre;
    int edad;
    String carrera;

    
    public Estudiante(String nombre, int edad, String carrera) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
    }
    public void presentarse() {
        System.out.println("Hola, me llamo " + nombre + ", tengo " + edad + " años y estudio " + carrera + ".");
    }
}
