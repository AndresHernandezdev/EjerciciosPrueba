/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase;

/**
 *
 * @author Andynux
 */
public class funcionario1 {
    
   private String rut;
   private String Nombre;
   private String Apellido;
   private String Direccion;
   private String fechanac;
   private int Sueldo;

    public funcionario1(String rut, String Nombre, String Apellido, String Direccion, String fechanac, int Sueldo) {
        this.rut = rut;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Direccion = Direccion;
        this.fechanac = fechanac;
        this.Sueldo = Sueldo;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getFechanac() {
        return fechanac;
    }

    public void setFechanac(String fechanac) {
        this.fechanac = fechanac;
    }

    public int getSueldo() {
        return Sueldo;
    }

    public void setSueldo(int Sueldo) {
        this.Sueldo = Sueldo;
    }
    
   public String getAtributos(){
      return this.rut+" "+this.Nombre+" "
                +this.Apellido+", "+this.Direccion+" "
                +this.fechanac+", "
                +this.Sueldo+" ";
   }
   
    
}
