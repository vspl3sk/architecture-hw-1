package ModelElements;

import Stuff.Point3D;
import java.util.List;

// класс полигона
public class Poligon {
    public List<Point3D> points;

    // конструктор класса (принимает минимум одну стартовую точку)
    public Poligon(Point3D point) {
        this.points.add(point);
    }

    // метод добавления точки в полигон
    // (метода не было в диаграмме, добавил по логике)
    public void AddPoint(Point3D point) {
        this.points.add(point);
    }
}
