/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entite;

/**
 *
 * @author Théoo
 */
public class LignesFacture {
    package entite;

import controle.ControleConnexion.ControleConnexion;

import java.sql.*;

import java.util.ArrayList;

import java.util.Date;

import javax.swing.JOptionPane;

public class LignesFacture {

private String code_facture;

private Article unArticle;

private int quantite;

private double prix_unitaire;

private double total;

private static Connection laConnexion = 

private final ArrayList<LignesFacture>lesEnreg = 

/*

* Constructeur 1

*/

public LignesFacture(String code_facture, Article unArticle,

ControleConnexion.getLaConnectionStatique();

new ArrayList<>();

int quantite, double prix_unitaire, double total) {

this.code_facture = code_facture;

this.unArticle = unArticle;

this.quantite = quantite;

this.prix_unitaire = prix_unitaire;

this.total = total;

}

 

 

/*

* Constructeur 2

*/

public LignesFacture(String code_facture){

// à activer dès création de la méthode

// lireRecupCRUD(code_facture);

}

 

/*

* Constructeur 3

*/

public LignesFacture(String code_facture, 

String code_article, int quantite, 

double prix_unitaire, double total){

this.code_facture = code_facture;

this.unArticle.setCode(code_article);

this.quantite = quantite;

this.prix_unitaire = prix_unitaire;

this.total = total;

}

 

/*

* Constructeur 4 : vide

*/

public LignesFacture(){

}

 

/*

* Accesseur et mutateur

*/

public String getCode_facture() {

return code_facture;

}

public void setCode_facture(String code_facture) {

this.code_facture = code_facture;

}

public Article getUnArticle() {

return unArticle;

}

public void setUnArticle(Article unArticle) {

this.unArticle = unArticle;

}

public int getQuantite() {

return quantite;

}

public void setQuantite(int quantite) {

this.quantite = quantite;

}

public double getPrix_unitaire() {

return prix_unitaire;

}

public void setPrix_unitaire(double prix_unitaire) {

this.prix_unitaire = prix_unitaire;

}

public double getTotal() {

return total;

}

public void setTotal(double total) {

this.total = total;

}

public ArrayList<LignesFacture> getLesEnreg() {

return lesEnreg;

}

}
}
