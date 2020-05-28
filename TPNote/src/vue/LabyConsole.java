/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

import java.util.InputMismatchException;
import java.util.Scanner;
import model.*;

/**
 *
 * @author victo
 */
public class LabyConsole {
    
    /**
     * Affiche le menu composé de 3 choix : déplacement aléatoire, en profondeur DFS ou quitter le programme.
     * L’utilisateur doit saisir un choix de type int et recommencer tant qu’aucun des 3 choix proposés n’est valide,
     *  y compris si l’utilisateur saisit des caractères au lieu d’un nombre entier.
     * Il faut donc pouvoir convertir la saisie, y compris avec des caractères, en entier.
     * Dans le cas où l’utilisateur saisit des caractères autres que des chiffres, cette conversion génère
     * l’exception  NumberFormatException qu’il faut attraper pour afficher un message d’erreur,
     * tout en pouvant recommencer la saisie.
     *
     * Cette méthode retourne le choix saisi.
     *
     * @return choix
     */
    public int menu() {
        
        
        
         String choix1 = "";
         int choix = 10;
        boolean erreur; //Forum Developez.net pour l'idée du do while 
         do{
             System.out.println("1 Deplacer automatique en profondeur \n 2 Deplacer aleatoire \n 0 Quitter \n Entrer votre choix : \n");
             erreur =false;
             try {
           
        Scanner in = new Scanner(System.in);
        choix1 = in.next(); 
        choix = Integer.parseInt(choix1);
        
              }
           catch( NumberFormatException |InputMismatchException e){ // Le multicatch expliqué par openclassroom
         erreur = true;
         System.out.print("Merci de ne rentrer que des valeures numériques, et égale à 0, 1 ou 2 \n");
         }
             if(choix != 0 && choix != 1 && choix != 2){
                 System.out.print("Merci de ne rentrer que des valeures numériques, et égale à 0, 1 ou 2 \n");
                 erreur =true;
             }
         }
         while (erreur);
         return choix;

              
    }

    /**
     * Affiche les coordonnées positionX et positionY protected de la Case c en paramètre
     *
     * @param c 
     */
    public void affiche(Case c) { 
        
         int X = c.getPositionX();
        int Y = c.getPositionY();
        
        System.out.println("Position X : " + X + " position Y : " + Y);
    
    }

    /**
     * Affiche un labyrinthe en mode console en se servant des méthodes du Labyrinthe laby en paramètre :
     * afficher toutes les cases soit de CaseMur avec le caractère ‘X’, soit de CaseTrou avec le caractère ’_’
     * en se servant de instanceof pour les distinguer, soit le caractère ‘V’ si la case est visitée (voir  la méthode
     *  getVisited définie dans l’interface Case et implémentée dans la classe CaseImplementee).
     *
     * @param laby
     */
    
    

    public void affiche(Labyrinthe laby) {
    
    }
    
    public static void main(String[] args){
        LabyConsole lab = new LabyConsole();
        lab.menu();
    }
    
}
