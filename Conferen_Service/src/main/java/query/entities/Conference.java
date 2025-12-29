package query.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Conference {

    @Id
    private String id;
    private String titre;
    private String type;
    private LocalDateTime date;
    private int duree;
    private int nbInscrits;
    private double score;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Review> reviews = new ArrayList<>();
}
