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
public class Article {
    package entite;

import controle.ControleConnexion.ControleConnexion;

import java.sql.*;

import java.util.ArrayList;

import java.util.Date;

import javax.swing.JOptionPane;

public class Article {

private String code;

private String code_categorie;

private String designation;

private int quantite;

private double prix_unitaire;

private Date date;

private static Connection laConnexion = ControleConnexion.getLaConnectionStatique();

private ArrayList<Article> lesEnreg = new ArrayList<>();

/*

 * Constructeur 1

 */

public Article(String code, String code_categorie, 

this.code = code;

this.code_categorie = code_categorie;

this.designation = designation;

this.quantite = quantite;

this.prix_unitaire = prix_unitaire;

this.date = date;

}

/*

* Constructeur 2

*/

public Article(){

}

/*

* Constructeur 3

*/

public Article(String code){

}

/*

* Accesseurs

*/

public String getCode() {

return code;

}

public String getCodeCategorie() {

return code_categorie;

}

public String getDesignation() {

return designation;

}

public int getQuantite() {

return quantite;

}

public double getPrix_unitaire() {

return prix_unitaire;

}

public Date getDate() {

return date;

}

public ArrayList<Article> getLesEnreg(){

return lesEnreg;

}

/*

* Mutateurs

*/

public void setCode(String code) {

this.code = code;

}

public void setReference(String code_categorie) {

this.code_categorie = code_categorie;

}

public void setDesignation(String designation) {

this.designation = designation;

}

public void setQuantite(int quantite) {

this.quantite = quantite;

}

public void setPrix_unitaire(double prix_unitaire) {

this.prix_unitaire = prix_unitaire;

}

public void setDate(Date date) {

this.date = date;

}

}

// à activer dès création de la méthode

// lireRecupCRUD();

this.code = code;
}
