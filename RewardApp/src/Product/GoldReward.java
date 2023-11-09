package Product;

public class GoldReward extends ItemReward{
    @Override
    public void open() {
        System.out.println("You won a Gold!");
    }
}
