/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Andynux
 */
public class Persona {
    
        //Atributos
        private String rut;
        private String nombre;
        private String apellido;
         private String direccion;
        
        //Constructor por defecto
        public Persona(){
                
        }
        //Constructor 
        public Persona(Persona persona){
                this.rut=persona.rut;
                this.nombre=persona.nombre;
                this.apellido=persona.apellido;
                this.direccion=persona.direccion;
        }
        
        
        public Persona(String rut, String nom, String app, String dir){
                this.rut=rut;
                this.nombre=nom;
                this.apellido=app;
                this.direccion=dir;
        }
        
        
        public String mostrarDatos(Persona persona){
                String datos="Los datos son: \n";
                datos+=persona.rut+"\n";
                datos+=persona.nombre+"\n";
                datos+=persona.apellido+"\n";
                datos+=persona.direccion+"\n";
                return datos;
        }
}
