package Fabric;

import Product.AmethystReward;
import interfaces.IGameItem;

public class AmethystGenerator extends ItemGenerator{
    @Override
    public IGameItem createItem() {
        return new AmethystReward();
    }

    @Override
    public int getWeight() {
        return 10;
    }

}
