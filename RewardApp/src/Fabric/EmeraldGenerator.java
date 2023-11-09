package Fabric;

import Product.EmeraldReward;
import interfaces.IGameItem;

public class EmeraldGenerator extends ItemGenerator{
    @Override
    public IGameItem createItem() {
        return new EmeraldReward();
    }

    @Override
    public int getWeight() {
        return 10;
    }
}
