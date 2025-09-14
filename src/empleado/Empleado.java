package empleado;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Pedro Hidalgo
 */
public class Empleado {
    
    private static int totalEmpleados = 0;
    private static Set<Integer> idsUsados = new HashSet<>();
    private static final double SALARIO_POR_DEFECTO = 1000.00;
    private int id;
    private String puesto;
    private String nombre;
    private double salario;

    public Empleado(int id, String puesto, String nombre, double salario) {
        if (idsUsados.contains(id)) {
        throw new IllegalArgumentException("El ID Empleado " + id + " ya está en uso");
        }
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        idsUsados.add(this.id);
        totalEmpleados ++;
    }

    public Empleado(String puesto, String nombre) {
        this.puesto = puesto;
        this.nombre = nombre;
        this.salario = SALARIO_POR_DEFECTO;
        boolean idValido = false;
        int idCandidato = totalEmpleados;
        idCandidato ++;
        do {
            if (!idsUsados.contains(idCandidato)) {
                idValido = true;
            } else {
                idCandidato ++;
            }
        } while (!idValido);
        this.id = idCandidato;
        idsUsados.add(this.id);
        totalEmpleados ++;
    }

    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", nombre=" + nombre + ", puesto=" + puesto + ", salario=" + salario + '}';
    }

    public static int getTotalEmpleados() {
        return totalEmpleados;
    }

    public int getId() {
        return id;
    }

    public String getPuesto() {
        return puesto;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public static void mostrarTotalEmpleados() {
        System.out.println("Total de empleados registrados: " + totalEmpleados);
    }
    
    public void actualizarSalario(double cantidad) {
        this.salario += cantidad;
    }
    
    public void actualizarSalario(int porcentaje) {
        this.salario = this.salario * (1 + porcentaje / 100.0);
    }
    
}
