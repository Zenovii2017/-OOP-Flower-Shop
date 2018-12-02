package Config;

import flowers.*;

public class RandomGenerator {
    public int getRandomInt(int min, int max) {
        return (int) (Math.random() * (max - min) + min);
    }

    public Flower getRandomFlower() {
        Flower flower;
        switch (this.getRandomInt(0, 2) % 2) {
            case 0:
                flower = new Chamomile();
                break;
            case 1:
                flower = new Rosie();
                break;
            default:
                flower = new Tulip();
        }
        flower.getRandomConfig();
        return flower;
    }
}
