package query.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import query.entities.Conference;

public interface ConferenceRepository extends JpaRepository<Conference, String> {
}

