package flowers;

import Config.RandomGenerator;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
public class FlowerBouquet {
    private List<Flower> bucket = new ArrayList<Flower>();
    private int price;

    public void getRandomFlowerBouquet() {
        List<Flower> new_bucket = new ArrayList<Flower>();
        int new_price = 0;
        Flower flower;
        RandomGenerator randomGenerator = new RandomGenerator();
        for (int i = 0; i < randomGenerator.getRandomInt(1, 10); i++) {
            flower = randomGenerator.getRandomFlower();
            new_bucket.add(flower);
            new_price += flower.getPrice();
        }
        this.bucket = new_bucket;
        this.price = new_price;
    }

    public void addFlower(Flower flower) {
        this.bucket.add(flower);
        this.price += flower.getPrice();
    }

    public void removeFlower(Flower flower) {
        this.bucket.remove(flower);
        this.price -= flower.getPrice();
    }

    public void removeFirstFlowerThisType(String name_of_flower) {
        for (Flower flower : this.bucket) {
            if (flower.getClass().getSimpleName().equals(name_of_flower)) {
                this.bucket.remove(flower);
                this.price -= flower.getPrice();
                break;
            }
        }
    }

    public void removeAllFlowersThisType(String name_of_flower) {
        List<Flower> new_bucket = new ArrayList<Flower>();
        int new_price = 0;
        for (Flower flower : this.bucket) {
            if (!flower.getClass().getSimpleName().equals(name_of_flower)) {
                new_bucket.add(flower);
                new_price += flower.getPrice();
            }
        }
        this.bucket = new_bucket;
        this.price = new_price;
    }

    @Override
    public String toString() {
        if (this.bucket.size() == 0) {
            return "Flower bucket is empty.";
        }
        StringBuilder returned = new StringBuilder();
        returned.append("Flower bucket consist of:\n\n");
        for (Flower flower : this.bucket) {
            returned.append(flower);
            returned.append("\n\n");
        }
        return returned.toString();
    }
}
