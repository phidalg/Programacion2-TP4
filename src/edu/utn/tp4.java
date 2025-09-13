package edu.utn;

import empleado.Empleado;

/**
 *
 * @author Pedro Hidalgo
 */
public class tp4 {

    public static void main(String[] args) {
        
        Empleado empleado1 = new Empleado(2, "coso", "lolool", 100.0);
        Empleado empleado2 = new Empleado("asd", "asdf");
        Empleado empleado3 = new Empleado("asdfgh", "asdfgh");
        Empleado empleado4 = new Empleado("asdfgh", "asdfgh");
        Empleado empleado5 = new Empleado("asdfgh", "asdfgh");
        Empleado empleado6 = new Empleado("asdfgh", "asdfgh");
        
        System.out.println(empleado1.toString());
        System.out.println(empleado2.toString());
        System.out.println(empleado3.toString());
        System.out.println(empleado4.toString());
        System.out.println(empleado5.toString());
        System.out.println(empleado6.toString());
        
        Empleado.mostrarTotalEmpleados();
        
        System.out.println("");
        empleado1.actualizarSalario(10);
        System.out.println(empleado1);

    }
    
}
