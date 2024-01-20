public class Triangle implements Shape{
    private ShapeEnum shapeType;
    public Triangle(){
        this.shapeType = ShapeEnum.TRIANGLE;
    }

    @Override
    public void draw() {
        int height = 5;
        drawTriangle(height);
    }
    static void drawTriangle(int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}