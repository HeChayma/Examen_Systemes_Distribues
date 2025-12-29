package query.services;

import org.springframework.stereotype.Service;
import query.dto.KeynoteResponseDTO;
import query.entities.Keynote;
import query.repositories.KeynoteRepository;

import java.util.List;

@Service
public class KeynoteService {

    private final KeynoteRepository keynoteRepository;

    public KeynoteService(KeynoteRepository keynoteRepository) {
        this.keynoteRepository = keynoteRepository;
    }

    public List<KeynoteResponseDTO> getAllKeynotes() {
        return keynoteRepository.findAll()
                .stream()
                .map(k -> new KeynoteResponseDTO(
                        k.getId(),
                        k.getNom(),
                        k.getPrenom(),
                        k.getEmail(),
                        k.getFonction()))
                .toList();
    }

    public KeynoteResponseDTO getKeynoteById(String id) {
        Keynote k = keynoteRepository.findById(id).orElseThrow();
        return new KeynoteResponseDTO(
                k.getId(),
                k.getNom(),
                k.getPrenom(),
                k.getEmail(),
                k.getFonction());
    }
}
