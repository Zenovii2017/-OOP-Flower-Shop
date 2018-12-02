package flowers;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Odor {
    private int odor;

    @Override
    public String toString() {
        switch (Math.abs(this.odor % 5)) {
            case 0:
                return "amazing";
            case 1:
                return "beatiful";
            case 2:
                return "a little better than common";
            case 3:
                return "common";
            case 4:
                return "bad";
        }
        return "very bad";
    }
}
