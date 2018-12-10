/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Clases.Persona;

/**
 *
 * @author Andynux
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona persona1=new Persona("15.256.256-7", "Pedro", "Hernández", "Los duraznos #25");
                Persona persona2=new Persona("9.526.594-8","Juan","Galarga","Calle dos #5");
                Persona persona3=new Persona("10.489.649-K", "Diego", "Soduro","Calle tupoto #62");

                /*******************************************************/
       
                Persona persona=new Persona();
                System.out.println(persona1.mostrarDatos(persona1));
                
                Persona persona5=new Persona(persona1);
                System.out.println(persona2.mostrarDatos(persona2));
                
                System.out.println(persona1.mostrarDatos(persona3));
    }
    
}
