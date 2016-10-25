/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecte;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Projecte {

    /**
     * @param args the command lineas arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        int numero=0 ;
        String nom=null;
        String direccio=null;
        String dni=null;
        int telefon;
        int mobil;
        String social=null;
        double salari;
        boolean sociempresa=false;
                
        System.out.println("Benvolguts a...");
        System.out.println("-------------------------------------");
        System.out.println("0-Sortir");
        System.out.println("1-Afegir dades");
        System.out.println("2-Borrar dades");
        System.out.println("3-Modificar dades");
        System.out.println("4-Llistat de les dades existents");
        System.out.println("--------------------------------------");
        System.out.println("Introdueix una opcio del menu");
        numero = entrada.next().charAt(0);
        switch (numero) {
                case '0':
                    System.out.println("Fins a la proxima");
                            break;
                case '1':
                    System.out.println("Afegeix la teva nova dada");
                            break;
                case '2':
                    System.out.println("Quina dada vols eliminar");
                            break;
                case '3':
                    System.out.println("Quina dada vols modificar");
                            break;
                case '4':
                    System.out.println("Aqui tens la teva llista de totes les dades introduides");
                    System.out.println("------------------------------------------------------------") ;       
        
 

        
        
        
        
        
        
        
        
        
        
        
    }
    
}
