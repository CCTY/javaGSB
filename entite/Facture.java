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
public class Facture {
    package entite;

import controle.ControleConnexion.ControleConnexion;

import java.sql.*;

import java.util.ArrayList;

import java.util.Date;

import javax.swing.JOptionPane;

public class Facture {

// propriétés

// ----------

private String code;

private Client code_client;

private double total_ttc;

private int codeModeReglement;

private Mode_Reglement mode_reglement;

private Date date;

// pour obtenir la connexion statique

private static Connection laConnexion = 

// pour stocker les enregistrements de la BD

private final ArrayList<Facture> lesEnreg = new ArrayList<>();

// Constructeurs

// -------------

// Constructeur 1

public Facture(String code, Client code_client, double total_ttc,

 Mode_Reglement mode_reglement, Date date) {

this.code = code;

this.code_client = code_client;

this.total_ttc = total_ttc;

this.mode_reglement = mode_reglement;

this.date = date;

}

// Constructeur 2

public Facture(){

// à activer dès création de la méthode

// lireRecupCRUD();

}

 

// Constructeur 3 pour initier la recherche

public Facture(String code){

}

 

// Accesseurs

// ----------

public String getCode() {

return code;

}

public Client getCode_client() {

return code_client;

}

public double getTotal_ttc() {

return total_ttc;

}

public Mode_Reglement getMode_reglement() {

return mode_reglement;

}

public Date getDate() {

return date;

}

public int getCodeModeReglement() {

return codeModeReglement;

}

public ArrayList<Facture> getLesEnreg() {

return lesEnreg;

}

}
}
