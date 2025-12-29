package command.commands;

import org.axonframework.modelling.command.TargetAggregateIdentifier;

import java.time.LocalDateTime;

public class CreateConferenceCommand {

    @TargetAggregateIdentifier
    private String id;
    private String titre;
    private String type;
    private LocalDateTime date;
    private int duree;

    public CreateConferenceCommand(String id, String titre, String type,
                                   LocalDateTime date, int duree) {
        this.id = id;
        this.titre = titre;
        this.type = type;
        this.date = date;
        this.duree = duree;
    }

    public String getId() {
        return id;
    }

    public String getTitre() {
        return titre;
    }

    public String getType() {
        return type;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public int getDuree() {
        return duree;
    }
}