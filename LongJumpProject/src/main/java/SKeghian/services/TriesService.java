package SKeghian.services;

import SKeghian.repositories.TriesRepo;
import org.springframework.stereotype.Service;

@Service
public class TriesService {

    private final TriesRepo triesRepo;

    public TriesService(TriesRepo triesRepo) {
        this.triesRepo = triesRepo;
    }
}
