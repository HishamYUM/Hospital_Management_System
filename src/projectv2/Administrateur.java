
package projectv2;


public class Administrateur extends User {
    
    private String Admin_id;
    public Administrateur(String nom_utilisateur, String mot_de_passe,String Admin_id) {
        super(nom_utilisateur, mot_de_passe);
        this. Admin_id= Admin_id;
    }

    public String getAdmin_id() {
        return Admin_id;
    }

    public void setAdmin_id(String Admin_id) {
        this.Admin_id = Admin_id;
    }
    
}
