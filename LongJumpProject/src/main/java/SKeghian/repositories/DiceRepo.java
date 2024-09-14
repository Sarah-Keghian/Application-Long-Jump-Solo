package SKeghian.repositories;

import SKeghian.models.Dice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiceRepo extends JpaRepository<Dice, Long> {
}
