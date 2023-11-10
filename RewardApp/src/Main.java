import Fabric.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<ItemGenerator> generators = new ArrayList<>();
        generators.add(new GoldGenerator());
        generators.add(new GemGenerator());
        generators.add(new AmethystGenerator());
        generators.add(new DiamondGenerator());
        generators.add(new EmeraldGenerator());
        generators.add(new RubyGenerator());
        generators.add(new SapphireGenerator());


        Random random = new Random();
        int totalWeight = generators.stream().mapToInt(ItemGenerator::getWeight).sum();

        for (int i = 0; i < 100; i++){
            int randomNumber = random.nextInt(totalWeight);
            int index = 0;
            int sum = generators.get(0).getWeight();
            while (randomNumber >= sum){
                index++;
                sum+=generators.get(index).getWeight();
            }
            generators.get(index).openReward();

        }
    }
}