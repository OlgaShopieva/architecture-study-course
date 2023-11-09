package Fabric;

import Product.DiamondReward;
import interfaces.IGameItem;

public class DiamondGenerator extends ItemGenerator{
    @Override
    public IGameItem createItem() {
        return new DiamondReward();
    }

    @Override
    public int getWeight() {
        return 10;
    }
}
