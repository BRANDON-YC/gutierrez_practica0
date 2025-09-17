package Java;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ejercicio 1: pares 0 a tantos
        System.out.print("Ingresa un número: ");
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) System.out.print(i + (i < n ? " " : ""));
        }
        System.out.println("\n---");

        // Ejercicio 2: Libro
        libro l1 = new libro("github", "Robert C. mamani", 2003);
        libro l2 = new libro("git", "Joshua quispe", 2008);
        l1.mostrarInfo();
        l2.mostrarInfo();
        System.out.println("---");

        // Ejercicio 3: Alumno + Streams nota >= 60
        List<alumno> alumnos = Arrays.asList(
                new alumno("Ana", 55),
                new alumno("Luis", 60),
                new alumno("Gabi", 95),
                new alumno("Sofi", 40)
        );

        List<alumno> aprobados = alumnos.stream()
                .filter(a -> a.getNota() >= 60)
                .collect(Collectors.toList());

        System.out.println("Aprobados (>=60): " + aprobados);
        System.out.println("---");

        //caja - Contenedor
        caja<alumno> caja = new caja<>();
        caja.guardar(new alumno("Mario", 78));
        System.out.println("Desde caja: " + caja.obtener());

        sc.close();
    }
}
