package factory;


import test.QuickSort;

public class Main extends QuickSort {

    public static void main(String[] args) {
        Shape c = ShapeFactory.createShape(ShapeTypes.CIRCLE);
        c.draw();
        Main main = new Main();
        Shape t = ShapeFactory.createShape(ShapeTypes.TRIANGLE);
        t.draw();

        Shape r = ShapeFactory.createShape(ShapeTypes.RECTANGLE);
        r.draw();
    }
}
