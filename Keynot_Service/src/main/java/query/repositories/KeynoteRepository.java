package query.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import query.entities.Keynote;

public interface KeynoteRepository extends JpaRepository<Keynote, String> {
}
