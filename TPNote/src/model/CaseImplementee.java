/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import static java.util.Optional.empty;

/**
 *
 * @author Paul
 */
public class CaseImplementee implements Case{
    protected int positionX, positionY; // position courante dans la case
    protected boolean visited, moved; // booléens de visite visited et d’accès moved à la case
    protected ArrayList<Case> voisins; // Liste des cases voisines
    protected int nb_voisins; // nombre de cases voisines
    
   @Override
   public int getPositionX() {
       return positionX;
   }
    
    /** 
    * Constructeur qui initialise respectivement les attributs positionX et positionY avec les paramètres lig et col.
    * Par défaut, les booléens visited et  moved sont false, la liste des voisins est vide et nb_voisins est nul.
     * @param lig
     * @param col
    */
   public CaseImplementee(int lig, int col) {
       this.positionX = lig;
       this.positionY = col;
       this.moved = false;
       this.visited = false;
       this.voisins = null;
       this.nb_voisins = 0;
               
       
   }

    @Override
    public int getPositionY() {
        return positionY;
    }

    @Override
    public boolean canMoveToCase() {
        return moved;
        
    }

    @Override
    public boolean getVisited() {
        return visited;
        
    }

    @Override
    public void setVisited() {
        this.visited = true;
        
    }

    @Override
    public Case getVoisin(int i) {
        return voisins.get(i);
        
    }

    @Override
    public int getNbVoisins() {
        return nb_voisins;
        
    }
}
