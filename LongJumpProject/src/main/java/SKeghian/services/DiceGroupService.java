package SKeghian.services;

import SKeghian.repositories.DiceGroupRepo;
import org.springframework.stereotype.Service;

@Service
public class DiceGroupService {

    private final DiceGroupRepo diceGroupRepo;

    public DiceGroupService(DiceGroupRepo diceGroupRepo) {
        this.diceGroupRepo = diceGroupRepo;
    }
}
