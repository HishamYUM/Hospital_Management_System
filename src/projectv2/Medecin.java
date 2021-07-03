
package projectv2;


public class Medecin extends User{
    private String Medecin_id;
    public Medecin(String nom_utilisateur, String mot_de_passe,String Medecin_id) {
        super(nom_utilisateur, mot_de_passe);
        this.Medecin_id=Medecin_id;
    }

    public String getMedecin_id() {
        return Medecin_id;
    }

    public void setMedecin_id(String Medecin_id) {
        this.Medecin_id = Medecin_id;
    }
    
    
    
}
