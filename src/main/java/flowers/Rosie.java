package flowers;

public class Rosie extends Flower {

    @Override
    public void getRandomConfig() {
        super.getRandomConfig();
        this.setSpikes(true);
    }
}
