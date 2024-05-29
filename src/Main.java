import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);

        boolean continuar = true;
        while (continuar) {
            System.out.print("Ingresa el ID del empleado: ");
            int id = teclado.nextInt();
            teclado.nextLine(); // consume newline left-over

            System.out.print("Ingresa el nombre del empleado: ");
            String nombre = teclado.nextLine();

            System.out.print("Ingresa el apellido del empleado: ");
            String apellido = teclado.nextLine();

            System.out.print("Ingresa el departamento del empleado: ");
            String departamento = teclado.nextLine();

            System.out.print("Ingresa el salario del empleado: ");
            double salario = teclado.nextDouble();
            teclado.nextLine(); // consume newline left-over

            Empleado empleado = new Empleado(id, nombre, apellido, departamento, salario);
            empleados.add(empleado);

            System.out.print("Desea continuar registrando empleados? (s/n): ");
            String respuesta = teclado.nextLine();
            continuar = respuesta.equalsIgnoreCase("s");
        }

        
        Collections.sort(empleados, (e1, e2) -> Integer.compare(e2.getId(), e1.getId()));

        
        Iterator<Empleado> iterator = empleados.iterator();
        while (iterator.hasNext()) {
            Empleado empleado = iterator.next();
            System.out.println("ID: " + empleado.getId());
            System.out.println("Nombre: " + empleado.getNombre());
            System.out.println("Apellido: " + empleado.getApellido());
            System.out.println("Departamento: " + empleado.getDepartamento());
            System.out.println("Salario: " + empleado.getSalario());
            System.out.println();
        }
    }
}