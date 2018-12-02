package flowers;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Country {
    private int country;

    @Override
    public String toString() {
        switch (Math.abs(this.country % 5)) {
            case 0:
                return "Ecuador";
            case 1:
                return "Netherlands";
            case 2:
                return "Turkey";
            case 3:
                return "USA";
            case 4:
                return "Ukraine";
        }
        return "very bad";
    }
}
