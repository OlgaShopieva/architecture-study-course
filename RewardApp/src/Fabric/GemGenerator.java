package Fabric;

import Product.GemReward;
import interfaces.IGameItem;

public class GemGenerator extends ItemGenerator{
    @Override
    public IGameItem createItem() {
        return new GemReward();
    }

    @Override
    public int getWeight() {
        return 1;
    }
}
