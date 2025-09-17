package Java;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Estudiante est1 = new Estudiante("Jhon", 20, "Ingeniería de Sistemas");
        Estudiante est2 = new Estudiante("Brandon", 22, "Derecho");

        est1.presentarse();
        est2.presentarse();

        List<Producto> productos = Arrays.asList(
            new Producto("Mouse", 25.0),
            new Producto("Teclado", 55.0),
            new Producto("Monitor", 150.0),
            new Producto("USB", 15.0)
        );

        System.out.println("Productos con precio mayor a 50:");
        productos.stream()
                 .filter(p -> p.precio > 50)
                 .forEach(System.out::println);

        Caja<Producto> caja = new Caja<>();
        Producto p1 = new Producto("Laptop", 1200.0);

        caja.guardar(p1);
        System.out.println("\nProducto en la caja:");
        System.out.println(caja.obtener());
    }
}
