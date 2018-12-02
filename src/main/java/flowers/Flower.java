package flowers;

import Config.RandomGenerator;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Flower {
    private Color color;
    private int length_of_the_stem;
    private Odor odor;
    private Country country_of_origin;
    private int price;
    private boolean spikes;

    public void getRandomConfig() {
        RandomGenerator randomGenerator = new RandomGenerator();
        this.color = new Color((int) (randomGenerator.getRandomInt(0, 256)), (int) (randomGenerator.getRandomInt(0, 256)), randomGenerator.getRandomInt(0, 256));
        this.length_of_the_stem = randomGenerator.getRandomInt(25, 51);
        this.odor = new Odor();
        this.odor.setOdor(randomGenerator.getRandomInt(0, 6));
        this.country_of_origin = new Country();
        this.country_of_origin.setCountry(randomGenerator.getRandomInt(0, 6));
        this.price = randomGenerator.getRandomInt(50, 251);
    }

    @Override
    public String toString() {
        return "Flower name is " + this.getClass().getSimpleName() +
                "\n" + this.getColor() +
                "\nlength of the stem = " + this.length_of_the_stem +
                " cm\nodor is " + this.getOdor() +
                "\ncountry of origin is " + this.getCountry_of_origin() +
                "\nis spikes - " + this.isSpikes() +
                "\nprice = " + this.getPrice() + " UAH";
    }
}
