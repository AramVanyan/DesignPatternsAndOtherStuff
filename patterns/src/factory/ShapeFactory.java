package factory;

public class ShapeFactory {
    public static Shape createShape(int shapeCode) {
        switch (shapeCode) {
            case ShapeTypes.CIRCLE:
                return new Circle();

            case ShapeTypes.TRIANGLE:
                return new Triangle();

            case ShapeTypes.RECTANGLE:
                return new Rectangle();
        }
        return null;
    }
}
