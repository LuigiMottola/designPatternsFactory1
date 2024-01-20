public class Main {
    public static void main(String[] args) {
        Shape shape1 = ShapeFactory.generateShape(ShapeEnum.TRIANGLE);
        Shape shape2 = ShapeFactory.generateShape(ShapeEnum.RECTANGLE);
        Shape shape3 = ShapeFactory.generateShape(ShapeEnum.RHOMBUS);

        shape1.draw();
        shape2.draw();
        shape3.draw();
    }
}
