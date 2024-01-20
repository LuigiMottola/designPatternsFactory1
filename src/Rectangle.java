public class Rectangle implements Shape{
    private ShapeEnum shapeType;
    public Rectangle(){
        this.shapeType = ShapeEnum.RECTANGLE;
    }
    @Override
    public void draw() {
        int width = 30;
        int height = 6;

        drawRectangle(width, height);
    }
    static void drawRectangle(int width, int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
