package Product;

public class GemReward  extends ItemReward{
    @Override
    public void open() {
        System.out.println("You won a Gem!");
    }
}
