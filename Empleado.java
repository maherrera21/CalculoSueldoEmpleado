/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

/**
 *
 * @author Administrador
 */
public class Empleado {
   public String nombre;
   public String apellido;
   public int horasTrabajadas;
   public int sueldo;

  
    public void establecerNombre(String n) {
     nombre = n;
    }

    public String obtenerNombre() {
       return nombre;
    }

    public void establecerApellido(String n) {
       apellido=n ;
    }

    public String obtenerApellido() {
        return apellido;
    }
  public void establecerHorasTrabajadas(int n) {
        horasTrabajadas = 180;
    }
   public int HorasTrabajadas() {
        return horasTrabajadas;
    }
      public void establecerSueldo() {
         sueldo= horasTrabajadas * 10;
    }
    public int obtenerSueldo() {
        return sueldo;
    }
}


