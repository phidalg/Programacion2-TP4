Trabajo práctico 4 de la materia Programación II, Tecnicatura Universitaria en Programación,
Universidad Tecnológica Nacional.

Alumno Pedro Nicolás Hidalgo.

Consiste en un ejercicio sobre POO en Java que se detalla a continuación:

Caso Práctico: Sistema de Gestión de Empleados

Modelar una clase Empleado que represente a un trabajador en una empresa.
Esta clase debe incluir constructores sobrecargados, métodos sobrecargados y el uso
de atributos aplicando encapsulamiento y métodos estáticos para llevar control de los
objetos creados.

Atributos:

    - int id: Identificador único del empleado.

    - String nombre: Nombre completo.

    - String puesto: Cargo que desempeña.

    - double salario: Salario actual.

    - static int totalEmpleados: Contador global de empleados creados.

Requerimientos:
1. Uso de this:

    - Utilizar this en los constructores para distinguir parámetros de atributos.  
  
2. Constructores sobrecargados:

    - Uno que reciba todos los atributos como parámetros.
  
    - Otro que reciba solo nombre y puesto, asignando un id automático y un salario por defecto.
  
    - Ambos deben incrementar totalEmpleados.
  
3. Métodos sobrecargados actualizarSalario:

    - Uno que reciba un porcentaje de aumento.
  
    - Otro que reciba una cantidad fija a aumentar.
  
4. Método toString():

    - Mostrar id, nombre, puesto y salario de forma legible.
  
5. Método estático mostrarTotalEmpleados():

    - Retornar el total de empleados creados hasta el momento.
  
6. Encapsulamiento en los atributos:

    - Restringir el acceso directo a los atributos de la clase.
  
    - Crear los métodos Getters y Setters correspondientes.

Adicionalmente, a pesar de no estar en los requerimientos, se implementó lógica
en los métodos constructores para evitar que se repitan IDs.
