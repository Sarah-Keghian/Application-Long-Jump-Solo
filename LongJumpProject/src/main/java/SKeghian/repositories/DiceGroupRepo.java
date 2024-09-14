package SKeghian.repositories;

import SKeghian.models.DiceGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiceGroupRepo extends JpaRepository<DiceGroup, Long> {
}
