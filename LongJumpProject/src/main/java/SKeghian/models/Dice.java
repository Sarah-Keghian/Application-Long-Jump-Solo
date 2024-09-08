package SKeghian.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.*;
import jakarta.persistence.Id;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@Builder
public class Dice {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idDice;

    private Integer position;
    private boolean frozen;
}
