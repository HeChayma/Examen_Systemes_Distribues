package query.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import query.dto.KeynoteResponseDTO;
import query.services.KeynoteService;

import java.util.List;

@RestController
@RequestMapping("/query/keynotes")
public class KeynoteQueryController {

    private final KeynoteService keynoteService;

    public KeynoteQueryController(KeynoteService keynoteService) {
        this.keynoteService = keynoteService;
    }

    @GetMapping
    public List<KeynoteResponseDTO> getAll() {
        return keynoteService.getAllKeynotes();
    }

    @GetMapping("/{id}")
    public KeynoteResponseDTO getById(@PathVariable String id) {
        return keynoteService.getKeynoteById(id);
    }
}
