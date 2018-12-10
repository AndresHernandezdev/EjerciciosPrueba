/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

import java.util.Scanner;


/**
 *
 * @author Andynux
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese Numero de la Cuenta"); 
        int cuenta=entrada.nextInt(); 
        entrada.skip("\n");
        System.out.println("Ingrese Titular de la Cuenta");
        String nombre=entrada.nextLine();
        System.out.println("Ingrese deposito");
        int deposito=entrada.nextInt();
        System.out.println("Valor del dolar");
        int dolar=entrada.nextInt();
        System.out.println("Ingrese Interes Anual");
        double interes=entrada.nextInt();
        System.out.println("Realize un Giro");
        int giro=entrada.nextInt();
        int ti=0;
        int total= deposito-giro;
        ti=(int) ((total*interes)/100);
        System.out.println("Usted hizo un deposito de "+deposito+ "\n y realizo un Giro de "+giro+ "\n quedando un saldo de "+ total);
        System.out.println("el interes ganado es de "+(total+ti));
        System.out.println("Usted tiene "+(total/dolar)+" dolares \n");
        if (total>=0) {
        System.out.println("Su cuenta es Positiva");
            
        }else
        System.out.println("Su cuenta esta en Rojo");
        
               
       
    }

     
}
