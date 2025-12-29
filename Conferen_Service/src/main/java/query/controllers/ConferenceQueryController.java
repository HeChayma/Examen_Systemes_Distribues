package query.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import query.entities.Conference;
import query.services.ConferenceService;

import java.util.List;

@RestController
@RequestMapping("/query/conferences")
public class ConferenceQueryController {

    private final ConferenceService conferenceService;

    public ConferenceQueryController(ConferenceService conferenceService) {
        this.conferenceService = conferenceService;
    }

    @GetMapping
    public List<Conference> getAll() {
        return conferenceService.getAll();
    }

    @GetMapping("/{id}")
    public Conference getById(@PathVariable String id) {
        return conferenceService.getById(id);
    }
}
