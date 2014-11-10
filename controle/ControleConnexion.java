/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

    import com.mysql.jdbc.Connection;

    import com.mysql.jdbc.Statement;

    import entite.Parametres;

    import java.sql.DriverManager;

    import java.sql.ResultSet;

    import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

    import javax.swing.JOptionPane;
/**
 *
 * @author Théoo
 */

public abstract class ControleConnexion {
    static Parametres lesParametres;
    static boolean etatConnexion;
    static Connection laConnectionStatique;

    public static Parametres getLesParametres() {
        return lesParametres;
    }

    public static boolean isEtatConnexion() {
        return etatConnexion;
    }

    public static Connection getLaConnectionStatique() {
        return laConnectionStatique;
    }

    public static void setLesParametres(Parametres lesParametres) {
        ControleConnexion.lesParametres = lesParametres;
    }

    public static void setEtatConnexion(boolean etatConnexion) {
        ControleConnexion.etatConnexion = etatConnexion;
    }

    public static void setLaConnectionStatique(Connection laConnectionStatique) {
        ControleConnexion.laConnectionStatique = laConnectionStatique;
    }
    
    
static {
    boolean ok = true;
    lesParametres = new Parametres();
        try {
            Class.forName(lesParametres.getDriverSGBD());
            etatConnexion = true;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ControleConnexion.class.getName()).log(Level.SEVERE, null, ex);
            ok = false;
            etatConnexion = false;
        }
        if (ok) {
            try {
                String urlBD = lesParametres.getServeurBD();
                String nomUtilisateur = lesParametres
                .getNomUtilisateur();
                String MDP = lesParametres.getMotDePasse();
                
                
                laConnectionStatique = (Connection) DriverManager
                .getConnection(urlBD, nomUtilisateur, MDP);
                etatConnexion = true;
            }catch (Exception e) {

                JoptionPane.showMessageDialog(null,

                "Impossible de se connecter"

                + " à la base de données",

                "ALERTE", JoptionPane.ERROR_MESSAGE);

etatConnexion = false;
            }
        
}
        

}
public static void fermetureSession() {

try {

laConnectionStatique.close();

} catch (SQLException e) {

JOptionPane.showMessageDialog(null, 

"Problème rencontré"

+ "à la fermeture de la connexion",

"ERREUR", JoptionPane.ERROR_MESSAGE);

}
}
}