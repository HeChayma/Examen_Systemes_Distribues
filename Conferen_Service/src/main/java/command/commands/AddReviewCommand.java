package command.commands;


import org.axonframework.modelling.command.TargetAggregateIdentifier;

import java.time.LocalDateTime;

public class AddReviewCommand {

    @TargetAggregateIdentifier
    private String conferenceId;
    private String reviewId;
    private LocalDateTime date;
    private String texte;
    private int note;

    public AddReviewCommand(String conferenceId, String reviewId,
                            LocalDateTime date, String texte, int note) {
        this.conferenceId = conferenceId;
        this.reviewId = reviewId;
        this.date = date;
        this.texte = texte;
        this.note = note;
    }

    public String getConferenceId() {
        return conferenceId;
    }

    public String getReviewId() {
        return reviewId;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public String getTexte() {
        return texte;
    }

    public int getNote() {
        return note;
    }
}

