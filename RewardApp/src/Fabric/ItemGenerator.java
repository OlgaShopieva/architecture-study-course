package Fabric;

import interfaces.IGameItem;

public abstract class ItemGenerator {
    public abstract IGameItem createItem();
    public void openReward(){
        createItem().open();
    }
    public abstract int getWeight();
}
