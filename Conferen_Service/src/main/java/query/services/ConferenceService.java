package query.services;

import org.springframework.stereotype.Service;
import query.entities.Conference;
import query.repositories.ConferenceRepository;

import java.util.List;

@Service
public class ConferenceService {

    private final ConferenceRepository conferenceRepository;

    public ConferenceService(ConferenceRepository conferenceRepository) {
        this.conferenceRepository = conferenceRepository;
    }

    public List<Conference> getAll() {
        return conferenceRepository.findAll();
    }

    public Conference getById(String id) {
        return conferenceRepository.findById(id).orElseThrow();
    }
}

