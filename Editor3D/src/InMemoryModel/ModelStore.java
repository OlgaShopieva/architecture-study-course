package InMemoryModel;

import ModelElements.Camera;
import ModelElements.Flash;
import ModelElements.PoligonalModel;
import ModelElements.Scene;

import java.util.ArrayList;
import java.util.List;

public class ModelStore implements IModelChanger{
    public List<PoligonalModel> models;
    public List<Scene> scenes;
    public List<Flash> flashes;
    public List<Camera> cameras;
    private IModelChangedObserver[] changedObservers;

    public ModelStore(IModelChangedObserver[] changedObservers) {
        this.changedObservers = changedObservers;
        this.models = new ArrayList<>();
        this.flashes = new ArrayList<>();
        this.scenes = new ArrayList<>();
        this.cameras = new ArrayList<>();
    }
    public Scene getScene(int id){
        return scenes.get(id);
    }

    @Override
    public void NotifyChange(IModelChanger sender) {

    }
}
