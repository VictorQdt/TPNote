/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.*;
import model.Case.*;
import java.util.*;

import java.util.ArrayList;

/**
 *
 * @author Paul
 */
public class Labyrinthe {
    private int tailleX, tailleY; // largeur et hauteur
    private int departX, departY; // coordonnées de départ
    private int arriveeX, arriveeY; // coordonnées d'arrivée
    private int posX, posY; // coordonnées courantes
    private ArrayList<Case> grille; // liste des cases du labyrinthe
    Case[][] cases;
    private String message = "Mauvais format de fichier";

    private static class ImpossibleMoveException extends Exception {

        public ImpossibleMoveException() {
        }
    }
    
    //https://books.google.fr/books?id=W6bomXWB-TYC&pg=PA643&lpg=PA643&dq=throws+FileFormatException&source=bl&ots=4uN6TPslnL&sig=ACfU3U3qmWxzmit1HvTRiJZeismJnCXhbw&hl=fr&sa=X&ved=2ahUKEwi519yB09bpAhVPExoKHRLkARYQ6AEwAnoECAYQAQ#v=onepage&q=throws%20FileFormatException&f=false
    class FileFormatException extends IOException {
        public FileFormatException() {}
        public FileFormatException(String message){};
    }
    
    /**
     * Constructeur qui initialise tous les attributs et crée tous les objets du labyrinthe à partir du fichier lu fic en  paramètre :
     * instancier toutes les cases soit de CaseMur, soit de CaseTrou en se servant de instanceof pour les distinguer.
     * Il génère et propage l’exception FileFormatException en cas de problème de format du fichier : voir le format du
     * fichier dans Présentation du sujet
     * Dans le cas où le fichier n’existe pas, cela génère l’exception FileNotFoundException qu’il faut attraper pour générer
     * l’exception FileFormatException.    
     *
     * @param fic
     * @throws FileFormatException : problème de format de fichier
     */
    
    public Labyrinthe(File fic) throws FileFormatException, FileNotFoundException {
        // Le fichier d'entrée
      File file = new File("labyrinthe.txt");
      // Créer l'objet File Reader
      FileReader fr = new FileReader(file);
      // Créer l'objet BufferedReader  
      BufferedReader br = new BufferedReader(fr);  
      int c = 0;             
      // Lire caractère par caractère
      while((c = br.read()) != -1)
      {
            // convertir l'entier en char
            char ch = (char) c;  
            // Afficher le caractère      
            System.out.println(ch);    

}
    

    /**
     * Tente de se déplacer dans la case ligne et colonne en paramètres du labyrinthe et de la visiter.
     * Il génère et propage l’exception ImpossibleMoveException en cas d’impossibilité de déplacement : voir la méthode
     *  canMoveToCase définie dans l’interface Case et implémentée dans la classe CaseImplementee.
     *  S’il est possible de s’y déplacer, on la visite grâce à la méthode setVisited de la classe CaseImplementee
     *
     * @param ligne
     * @param colonne
     * @throws ImpossibleMoveException :  déplacement impossible
     */
    public void move(int ligne, int colonne) throws ImpossibleMoveException{
        if ((ligne > tailleX || ligne < 0) || (colonne > tailleY || colonne < 0) || cases[ligne][colonne].canMoveToCase() == false) {
            throw new ImpossibleMoveException();
            //lit les positions de ligne et Y colonne demande si c'est possible de s'y
            //deplacer. Si non, cela genère la classe ImpossibleMoveException
        } else { //sinon ca prend les valeurs ligne et colonne
            posX = ligne;
            posY = colonne;
        }
    }

    /**
     *  Se déplace  aléatoirement d’une case dans l’une des 4 directions possibles (pas de diagonale) sans déborder du
     *  labyrinthe.
     *  Cette méthode appelle la méthode move ci-dessus et propage l’exception ImpossibleMoveException en cas
     *  d’impossibilité de déplacement.
     *
     * @throws ImpossibleMoveException :  déplacement impossible
     */
    public void autoMove(){
    
        int movance = (int) (Math.random() * 4 ); 
        
        try{
            
             switch(movance){
            case 0:
                this.move(posX+1,posY);
                break;
            case 1:
                this.move(posX-1,posY);
                break;
            case 2:
                this.move(posX, posY+1);
                break;
            case 3:
                this.move(posX, posY-1);
                break;
        }
            
        }catch(ImpossibleMoveException e){}
         
    }

    /**
     * Retourne l’objet de la Case de la grille (liste des cases) du labyrinthe à partir de ses positions lig et col en paramètres
     *
     * @param lig
     * @param col
     * @return
     */
    public Case getCase(int lig, int col) {
       if (lig < 0 || lig >= tailleY || col < 0 || col >= tailleX ) {
            return null;
        }
        int objet = lig * tailleX + col;
        return grille.get(objet);
}
    
    public int getArriveeX(){
        return arriveeX;
    }
       public int getArriveeY(){
        return arriveeY;
    }
    public int getPosX(){
        return posX;
    }
        public int getPosY(){
        return posY;
    }
        
    public int sizeGrille(){
        return grille.size();
    }
    
    public Case[][] getCase(){
        return this.cases;
    }

    
}


