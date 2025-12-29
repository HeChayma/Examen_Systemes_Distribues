package query.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ConferenceRequestDTO {
    private String titre;
    private String type;
    private LocalDateTime date;
    private int duree;
}
