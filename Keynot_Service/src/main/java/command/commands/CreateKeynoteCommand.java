package command.commands;

import org.axonframework.modelling.command.TargetAggregateIdentifier;

public class CreateKeynoteCommand {

    @TargetAggregateIdentifier
    private String id;
    private String nom;
    private String prenom;
    private String email;
    private String fonction;

    public CreateKeynoteCommand(String id, String nom, String prenom,
                                String email, String fonction) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.fonction = fonction;
    }

    public String getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getEmail() {
        return email;
    }

    public String getFonction() {
        return fonction;
    }
}
