package query.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class KeynoteResponseDTO {
    private String id;
    private String nom;
    private String prenom;
    private String email;
    private String fonction;
}