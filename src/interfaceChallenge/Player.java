package interfaceChallenge;
import lombok.*;
import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString


public class Player implements Saveable {

    private String name;
    private int hitPoints;
    private int strenght;
    private String weapon;


    @Override
    public List<String> write() {
        List<String> values = new ArrayList<>();
        values.add(0,"Name: " + this.name);
        values.add(1, "Hitpoints: " + this.hitPoints);
        values.add(2, "Strenght: " + this.strenght);
        values.add(3, "Weapon: " + this.weapon);

        return values;
    }

    @Override
    public void read(List<String> savedValues) {
        if(savedValues != null && savedValues.size() > 0) {
            this.name = savedValues.get(0);
            this.hitPoints = Integer.parseInt(savedValues.get(1));
            this.strenght = Integer.parseInt(savedValues.get(2));
            this.weapon = savedValues.get(3);


    }
}
}
