package SKeghian.services;

import SKeghian.models.Game;
import SKeghian.repositories.GameRepo;
import org.springframework.stereotype.Service;

@Service
public class GameService {

    private final GameRepo gameRepo;

    public GameService(GameRepo gameRepo) {
        this.gameRepo = gameRepo;
    }
}
