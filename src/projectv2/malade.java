
package projectv2;


public class malade extends User
{
    private String code_assurance_maladie;
    public malade(String nom_utilisateur, String mot_de_passe,String code_assurance_maladie) {
        super(nom_utilisateur, mot_de_passe);
        this.code_assurance_maladie=code_assurance_maladie;
    }

    public String getCode_assurance_maladie() {
        return code_assurance_maladie;
    }

    public void setCode_assurance_maladie(String code_assurance_maladie) {
        this.code_assurance_maladie = code_assurance_maladie;
    }
    
}
