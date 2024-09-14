package SKeghian.repositories;

import SKeghian.models.Tries;
import org.springframework.data.annotation.ReadOnlyProperty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TriesRepo extends JpaRepository<Tries, Long> {
}
