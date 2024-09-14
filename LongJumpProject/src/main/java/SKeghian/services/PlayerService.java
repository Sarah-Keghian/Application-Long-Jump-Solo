package SKeghian.services;

import SKeghian.repositories.PlayerRepo;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {

    private final PlayerRepo playerRepo;

    public PlayerService(PlayerRepo playerRepo) {
        this.playerRepo = playerRepo;
    }
}
