package SKeghian.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@Builder
public class DiceGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idGroupDice;

    @ElementCollection
    private List<Long> idDiceList;
}
