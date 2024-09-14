package SKeghian.services;

import SKeghian.repositories.DiceRepo;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DiceService {

    private final DiceRepo diceRepo;

    @Autowired
    public DiceService(DiceRepo diceRepo) {
        this.diceRepo = diceRepo;
    }
}
