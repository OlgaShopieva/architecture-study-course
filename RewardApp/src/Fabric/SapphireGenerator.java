package Fabric;

import Product.SapphireReward;
import interfaces.IGameItem;

public class SapphireGenerator extends ItemGenerator{
    @Override
    public IGameItem createItem() {
        return new SapphireReward();
    }

    @Override
    public int getWeight() {
        return 10;
    }
}
