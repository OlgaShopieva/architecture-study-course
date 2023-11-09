package Fabric;

import Product.GoldReward;
import interfaces.IGameItem;

public class GoldGenerator extends ItemGenerator{
    @Override
    public IGameItem createItem() {
        return new GoldReward();
    }

    @Override
    public int getWeight() {
        return 3;
    }
}
