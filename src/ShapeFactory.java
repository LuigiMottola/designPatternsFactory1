public class ShapeFactory {
    public static Shape generateShape(ShapeEnum shapeEnum) {
        Shape shape = null;
        if (shapeEnum == ShapeEnum.TRIANGLE) {
            shape = new Triangle();
            return shape;
        } else if (shapeEnum == ShapeEnum.RECTANGLE) {
            shape = new Rectangle();
            return shape;
        } else if (shapeEnum == ShapeEnum.RHOMBUS) {
            shape = new Rhombus();
            return shape;
        }
        return shape;
    }
}
