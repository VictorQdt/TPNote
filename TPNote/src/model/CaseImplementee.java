/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Paul
 */
public class CaseImplementee {
    protected int positionX, positionY; // position courante dans la case
    protected boolean visited, moved; // booléens de visite visited et d’accès moved à la case
    protected ArrayList<Case> voisins; // Liste des cases voisines
    protected int nb_voisins; // nombre de cases voisines
    
    /** 
    * Constructeur qui initialise respectivement les attributs positionX et positionY avec les paramètres lig et col.
    * Par défaut, les booléens visited et  moved sont false, la liste des voisins est vide et nb_voisins est nul.
    */
   public CaseImplementee(int lig, int col) {
       
   }
}
