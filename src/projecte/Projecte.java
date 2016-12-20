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
        Scanner entrada = new Scanner(System.in);
        int numero = 0;
        String nom = null;
        String direccio = null;
        String dni = null;
        int telefon;
        int mobil;
        String social = null;
        double salari;
        boolean omplit = false;
        boolean sociempresa=false;
        char segur='a';
        
        System.out.println("Benvolguts a...");
        System.out.println("-------------------------------------");
        System.out.println("0-Sortir");
        System.out.println("1-Afegir dades");
        System.out.println("2-Borrar dades");
        System.out.println("3-Modificar dades");
        System.out.println("4-Llistat de les dades existents");
        System.out.println("--------------------------------------");
        System.out.println("--------------------------------------");
        System.out.println("--------------------------------------");
        
        System.out.println("Introdueix una opcio del menu");
        numero = entrada.next().charAt(0);
        switch (numero) {
            case '0':
                System.out.println("Fins a la proxima");
                break;
            case '1':
                if (!omplit) {
                    System.out.println("nom");
                    nom = entrada.next();
                    System.out.println("Direccio");
                    direccio = entrada.next();
                    System.out.println("dni");
                    dni = entrada.next();
                    System.out.println("telefon");
                    telefon = entrada.nextInt();
                    System.out.println("mobil");
                    mobil = entrada.nextInt();
                    System.out.println("numero de la seguretat social");
                    social = entrada.next();
                    System.out.println("ets soci de la empresa?");
                    //sociempresa = entrada.next();
                   char esSociEmpresa='d';
                    do{
                         esSociEmpresa = entrada.nextLine().toUpperCase().charAt(0);         //usem toUpperCase() que traduix el text introduït per l'usuari a majúscules, 
                                                                                              //per tant només haurem de tractar les lletres majúscules
                    }while(esSociEmpresa != 'S' && esSociEmpresa != 'N');
                    sociEmpresa = (esSociEmpresa == 'S');
                    
                    
                    
                    
                    omplit = true;
                } else {
                    System.out.println("Aquesta dada ya esta emplenada");
                }

                System.out.println("Afegeix la teva nova dada");
                break;
            case '2':
                System.out.println("Quina dada vols eliminar");
                if (omplit) {
                    System.out.println("Esteu segur de voler eliminar aquesta dada?[S/N]");
                    do {
                        segur = entrada.nextLine().toUpperCase().charAt(0);         //usem toUpperCase() que traduix el text introduït per l'usuari a majúscules, 
                                                                                    //per tant només haurem de tractar les lletres majúscules
                    } while (segur != 'S' && segur != 'N');
                    if (segur=='S'){
                        omplit=false;
                    }
                }

            case '3':
                System.out.println("Quina dada vols modificar");
                System.out.println("Vols veure el pilot?");
                switch (segur) {
                    case's': 
                        System.out.println("nom");
                        System.out.println(nom);
                        System.out.println("Direccio");
                        System.out.println(direccio);
                        System.out.println("dni");
                        System.out.println(dni);
                        System.out.println("telefon");
                        System.out.println(telefon);
                        System.out.println("mobil");
                        System.out.println(mobil);
                        System.out.println("numero de la seguretat social");
                        System.out.println(numerosocial);
                        System.out.println("ets soci de la empresa?");
                        System.out.println(sociempresa);
                        break;
                    case'n':
                        break;
            omplit=false;
            System.out.println("Vols modificar el nom?");
            switch (segur) {
                case's':
                    System.out.println("nou nom");
                    nom = entrada.next();
                
                case'n':
                    break;
            }
            System.out.println("Vols modificar la direccio?");
            switch (segur) {
                case's':
                    System.out.println("nova direccio");
                    direccio = entrada.next();
                
                case'n':
                    break;
            }
             System.out.println("Vols modificar el dni?");
            switch (segur) {
                case's':
                    System.out.println("nou dni");
                    dni = entrada.next();
                
                case'n':
                    break;
            }
             System.out.println("Vols modificar el telefon?");
            switch (segur) {
                case's':
                    System.out.println("nou telefon");
                    telefon = entrada.nextInt();
                
                case'n':
                    break;
            }
             System.out.println("Vols modificar el mobil?");
            switch (segur) {
                case's':
                    System.out.println("nou mobil");
                    mobil = entrada.nextInt();
                
                case'n':
                    break;
            }
             System.out.println("Vols modificar el numero de la seguretat social?");
            switch (segur) {
                case's':
                    System.out.println("nou numero de la seguretat social");
                    social = entrada.next();
                
                case'n':
                    break;
            }
            System.out.println("Pilot modificat correctament");
            omplit=true;
                }
                break;
            case '4':
                System.out.println("Aqui tens la teva llista de totes les dades introduides");
                System.out.println("------------------------------------------------------------");
            default:
                System.out.println("Aquesta no es una opcio del menu");

        }
    
}
