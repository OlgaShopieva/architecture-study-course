package Fabric;

import Product.RubyReward;
import interfaces.IGameItem;

public class RubyGenerator extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new RubyReward();
    }

    @Override
    public int getWeight() {
        return 10;
    }
}
