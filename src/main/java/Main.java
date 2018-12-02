import Config.RandomGenerator;
import flowers.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello! This is a flower shop!");
        System.out.println("We have an already formed bouquet or you can form it by yourself.");
        System.out.println("What type do you prefer?Input 1 if formed bouquet or 2 otherwise.");
        Scanner scan = new Scanner(System.in);
        String answer = scan.nextLine();
        FlowerBouquet my_bouquet = new FlowerBouquet();
        if (Integer.valueOf(answer) == 1) {
            ArrayList<ArrayList> bouquets = new ArrayList<ArrayList>();
            RandomGenerator randomGenerator = new RandomGenerator();
            ArrayList new_bouquet;
            for (int i = 1; i <= randomGenerator.getRandomInt(1, 10); i++) {
                FlowerBouquet flowerBouquet = new FlowerBouquet();
                flowerBouquet.getRandomFlowerBouquet();
                new_bouquet = new ArrayList();
                new_bouquet.add(i);
                new_bouquet.add(flowerBouquet);
                bouquets.add(new_bouquet);
            }
            System.out.println("Currently available bouquets");
            for (ArrayList flowerBouquet : bouquets) {
                System.out.println("Bucket number " + flowerBouquet.get(0) + " is\n" + flowerBouquet.get(1));
            }
            System.out.println("Which bouquet do you want?");
            answer = scan.nextLine();
            for (ArrayList bouquet : bouquets) {
                if (bouquet.get(0) == Integer.valueOf(answer)) {
                    my_bouquet = (FlowerBouquet) bouquet.get(1);
                }
            }
        }
        System.out.println("Do you want to add some flower to you bouquet?If yes input yes, if no input no.");
        answer = scan.nextLine();
        Flower flower;
        while (answer.equals("yes")) {
            System.out.println("Which type of flowers do you want add?");
            answer = scan.nextLine();
            switch ((char) (answer.charAt(0))) {
                case 'C':
                    flower = new Chamomile();
                    break;
                case 'R':
                    flower = new Rosie();
                    break;
                case 'T':
                    flower = new Tulip();
                    break;
                default:
                    flower = new Flower();
                    System.out.println("There no flower with this type!");
            }
            if (!flower.getClass().getSimpleName().equals("Flower")) {
                flower.getRandomConfig();
                my_bouquet.addFlower(flower);
            }
            System.out.println("Do you want to add some flower to you bouquet?If yes input yes, if no input no.");
            answer = scan.nextLine();
        }
        System.out.println("Do you have an allergic reaction to any kind of flowers?");
        answer = scan.nextLine();
        while (answer.equals("yes")) {
            System.out.println("Which type of flowers do you want remove from bouquet?");
            answer = scan.nextLine();
            my_bouquet.removeAllFlowersThisType(answer);
            System.out.println("Do you have an allergic reaction to any kind of flowers?");
            answer = scan.nextLine();
        }
        if (my_bouquet.getBucket().size() == 0) {
            System.out.println("You haven`t selected any bouquet");
        } else {
            System.out.println(my_bouquet);
            System.out.println("Price of your bouquet is " + my_bouquet.getPrice() + "UAH");
            System.out.println("Your order is processed");
        }
    }
}
