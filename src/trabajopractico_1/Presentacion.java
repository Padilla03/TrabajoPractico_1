/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajopractico_1;

/**
 *
 * @author User
 */
public class Presentacion {
   private String nombre = "Facundo";
   private String apellido = "Padilla";
   private int edad = 23 ; 

    public Presentacion() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String Apellido) {
        this.apellido = Apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
   
   public void Presentacion (){
       System.out.println("Mi nombre completo: "+ nombre +" "+ apellido +" y mi edad: "+edad);
   }
   
}
