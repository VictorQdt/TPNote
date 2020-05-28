/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

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
    private String message = "Mauvais format de fichier";

    private static class ImpossibleMoveException extends Exception {

        public ImpossibleMoveException() {
        }
    }
    
    //https://books.google.fr/books?id=W6bomXWB-TYC&pg=PA643&lpg=PA643&dq=throws+FileFormatException&source=bl&ots=4uN6TPslnL&sig=ACfU3U3qmWxzmit1HvTRiJZeismJnCXhbw&hl=fr&sa=X&ved=2ahUKEwi519yB09bpAhVPExoKHRLkARYQ6AEwAnoECAYQAQ#v=onepage&q=throws%20FileFormatException&f=false
    class FileFormatException extends IOException {
        public FileFormatException() {}
        public FileFormatException(String message){};
        public FileNotFoundException(){}
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
    public Labyrinthe(File fic) throws FileFormatException {
        
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
    public void move(int ligne, int colonne) throws ImpossibleMoveException{}

    /**
     *  Se déplace  aléatoirement d’une case dans l’une des 4 directions possibles (pas de diagonale) sans déborder du
     *  labyrinthe.
     *  Cette méthode appelle la méthode move ci-dessus et propage l’exception ImpossibleMoveException en cas
     *  d’impossibilité de déplacement.
     *
     * @throws ImpossibleMoveException :  déplacement impossible
     */
    public void autoMove() throws ImpossibleMoveException {}

    /**
     * Retourne l’objet de la Case de la grille (liste des cases) du labyrinthe à partir de ses positions lig et col en paramètres
     *
     * @param lig
     * @param col
     * @return
     */
    public Case getCase(int lig, int col) {
        return null;
}

    
}


