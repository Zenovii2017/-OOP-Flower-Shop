package flowers;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Color {
    private int red;
    private int green;
    private int blue;

    @Override
    public String toString() {
        return "Color consist of:" +
                "\n\tRed = " + this.red +
                "\n\tGreen = " + this.green +
                "\n\tBlue = " + this.blue;
    }
}
