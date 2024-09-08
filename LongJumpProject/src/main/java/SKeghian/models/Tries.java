package SKeghian.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@Builder
public class Tries {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idTries;

    private Long idGame;
    private Integer score1;
    private Integer score2;
    private Integer score3;
}
