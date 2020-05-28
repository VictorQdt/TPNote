/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

import java.io.File;
import model.Labyrinthe;
import vue.Labyconsole;

/**
 *
 * @author victo
 */
public class TestLaby {
    
    Labyrinthe labyrinthe = new Labyrinthe(File fic);
    Labyconsole console = new Labyconsole();
    
    public TestLaby(){}
    
    
    private static class FileFormatException extends Exception {

        public FileFormatException() {
        }
    }
    
    /**
     * Constructeur qui instancie l’objet en attribut de la classe Labyrinthe avec le fichier fic de type File en paramètre.
     *  Cette méthode propage l’exception FileFormatException en cas de problème de format du fichier.
     *
     * @param fic : fichier du labyrinthe
     * @throws FileFormatException : problème de format de ficher
     */
    public TestLaby(File fic) throws FileFormatException {}

 /**
     * Déplacement récursif en profondeur dans le labyrinthe à partir des positions ligne et colonne en paramètres.
     *  A chaque case visitée (voir la méthode getCase de la classe Labyrinthe) dans cette ligne et colonne, pas encore visitée
     * (voir la méthode getVisited implémentée dans la classe  CaseImplementee), on indique qu’on la visite (voir la méthode
     * setVisited implémentée dans la classe  CaseImplementee) et on affiche  les coordonnées de la case visitée et le
     * labyrinthe (voir les 2 méthodes surchargées affiche et affiche de LabyConsole).
     * Cette méthode retourne un booléen indiquant l’arrêt de déplacement : true si la sortie est atteinte
     * (voir les positions private dans la classe Labyrinthe), false sinon.
     *
     * @param ligne de la case
     * @param colonne de la case
     * @return d'un booléen d'arrêt du déplacement
     */
    public boolean deplacerDFS(int ligne, int colonne) {return false;
}

 /**
     * Déplacement aléatoire dans le labyrinthe : cette méthode utilise la méthodes autoMove de Labyrinthe qui peut
     * déclencher l’exception  ImpossibleMoveException à attraper.
     *  A chaque case visitée, on applique les mêmes instructions que celles commentées dans la méthode deplacerDFS.
     * Cette méthode retourne un booléen indiquant l’arrêt de déplacement : true si la sortie est atteinte
     * (voir les positions private dans la classe Labyrinthe), false sinon.
     *
     * @return d'un booléen d'arrêt du déplacement 
     */
    public boolean deplacerAuto() {return false;
}

 /**
     * Le main instancie l’objet du LabyConsole en attribut. Il saisit le nom du fichier du labyrinthe. Puis il instancie un
     * objet de la classe  TestLaby avec en paramètre le fichier, ce qui peut déclencher l’exception  FileFormatException
     * à attraper en affichant un message d’erreur sur un problème de format du fichier. Il affiche ensuite le labyrinthe avec
     * la bonne méthode affiche de LabyConsole. Il affiche le menu avec la méthode menu de LabyConsole. Selon le choix
     * retourné par le menu, soit il se déplace en profondeur avec deplacerDFS (à partir de la position de départ définie dans 
     * la classe Labyrinthe), soit aléatoirement avec deplacerAuto, soit il quitte le programme.
     */
    public static void main(String[] args) {}

    
}
