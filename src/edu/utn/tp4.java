package edu.utn;

import empleado.Empleado;

/**
 *
 * @author Pedro Hidalgo
 */
public class tp4 {

    public static void main(String[] args) {
        
        Empleado empleado1 = new Empleado(6, "Operario", "Alberto Álvarez", 1234567.0);
        Empleado empleado2 = new Empleado(8, "Operario", "Beatriz Benítez", 1234567.0);
        Empleado empleado3 = new Empleado(123, "RRHH", "Carlos Cárdenas", 1456789.0);
        Empleado empleado4 = new Empleado(500, "Contador", "Daniela Díaz", 1456789.0);
        
        System.out.println("Prueba 1: Instanciamos 4 empledos con el constructor que especifica todos los atributos.\n"
                        + "Se imprimen los datos de cada uno de ellos con el método toString() y luego llamamos al\n"
                        + "método mostrarTotalEmpleados()\n");
        
        System.out.println(empleado1);
        System.out.println(empleado2);
        System.out.println(empleado3);
        System.out.println(empleado4);
        
        Empleado.mostrarTotalEmpleados();

        Empleado empleado5 = new Empleado("Jefe", "Eduardo Escobar");
        Empleado empleado6 = new Empleado("Asesor", "Felipe Fernández");
        Empleado empleado7 = new Empleado("Analista", "Gabriela Gómez");
        Empleado empleado8 = new Empleado("Programador", "Héctor Herrera");
        Empleado empleado9 = new Empleado("Gerente", "Inés Iglesias");
        
        System.out.println("\nPrueba 2: Instanciamos más empleados con el constructor que solo especifica nombre y puesto.\n"
                        + "El constructor asigna un ID automático sin repetir los ID que ya están en uso.\n"
                        + "Luego, llamamos al método mostrarTotalEmpleados()\n");
        
        System.out.println(empleado5);
        System.out.println(empleado6);
        System.out.println(empleado7);
        System.out.println(empleado8);
        System.out.println(empleado9);
        
        Empleado.mostrarTotalEmpleados();
        
        System.out.println("\nPrueba 3: Actualizamos el salario del último empleado especificando un monto de aumento:\n");
        empleado9.actualizarSalario(1000.00);
        System.out.println(empleado9);
        System.out.println("\nPrueba 4: Actualizamos el salario del mismo empleado especificando un 50% de aumento:\n");
        empleado9.actualizarSalario(50);
        System.out.println(empleado9);
        
    }
    
}
