package SKeghian.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Setter
@Getter
@Builder
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idGame;

    private Long idPlayer;
    private Integer finalScore;


    public int compareTo(Game other) {

        if (this.finalScore < other.finalScore){
            return 1;
        }
        else if (this.finalScore > other.finalScore){
            return -1;
        }
        else {
            return 0;
        }
    }
}
