package InMemoryModel;

import ModelElements.*;
import java.util.ArrayList;
import java.util.List;

// класс хранилища моделей
public class ModelStore implements iModelChanger {
    public List<PoligonalModel> models;
    public List<Scene> scenes;
    public List<Flash> flashes;
    public List<Camera> cameras;
    private iModelChangeObserver[] changeObservers;

    // геттер для получния сцены по id
    public Scene getScene() {
        for (int i = 0; i < scenes.size(); i++) {
            if (scenes.get(i).id == i) {
                return scenes.get(i);
            }
        }
        return null;
    }

    // конструктор классв
    public ModelStore(iModelChangeObserver[] changeObservers) throws Exception {
        this.changeObservers = changeObservers;

        this.models = new ArrayList<PoligonalModel>();
        this.scenes = new ArrayList<Scene>();
        this.flashes = new ArrayList<Flash>();
        this.cameras = new ArrayList<Camera>();

        flashes.add(new Flash());
        cameras.add(new Camera());
        models.add(new PoligonalModel(new ArrayList<Texture>()));
        scenes.add(new Scene(1, models, flashes, cameras));
    }

    // перегрузка метода интерфейса. уведомление о смене модели.
    @Override
    public void NotifyChange(iModelChanger sender) {

    }
}
