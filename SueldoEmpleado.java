/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

/**
 *
 * @author Administrador
 */
public class SueldoEmpleado {
    public static void main(String[] args) {
      Empleado empleado = new Empleado();
      empleado.establecerNombre("Miguel");
      empleado.establecerApellido("Herrera");
      empleado.establecerHorasTrabajadas(180);
      empleado.establecerSueldo();

        System.out.println ("El nombre del empleado es:"  + empleado.obtenerNombre ());
        System.out.println ("El apellido  del empleado es:"  + empleado.obtenerApellido ());
        System.out.println ("El sueldo del empleado es:" + empleado.obtenerSueldo());
       
}
}
