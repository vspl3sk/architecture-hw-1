package ModelElements;

import java.util.List;

// класс сцены
public class Scene {
    public int id;
    public List<PoligonalModel> models;
    public List<Flash> flashes;
    public List<Camera> cameras;

    // конструктор класса (принимает ряд параметров:
    // id, список вспышек, список камер, список моделей)
    // список моделей и список камер не могут быть пустыми
    public Scene(
            int id,
            List<PoligonalModel> models,
            List<Flash> flashes,
            List<Camera> cameras) throws Exception {

        this.id = id;
        this.flashes = flashes;

        if (models.size() > 0) {
            this.models = models;
        } else {
            throw new RuntimeException("Must be at least one model");
        }

        if (cameras.size() > 0) {
            this.cameras = cameras;
        } else {
            throw new RuntimeException("Must be at least one camera");
        }
    }

    // некий метод 1
    public <T> T Method1(T type1) {
        return type1;
    }

    // некий метод 2
    public <T, T1> T Method2(T type2, T1 type3) {
        return type2;
    }
}
