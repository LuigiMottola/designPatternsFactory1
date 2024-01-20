public class Rectangle implements Shape{
    private ShapeEnum shapeType;
    public Rectangle(){
        this.shapeType = ShapeEnum.RECTANGLE;
    }
    @Override
    public void draw() {
        System.out.println(ShapeEnum.RECTANGLE + "\n");
        int width = 30;
        int height = 6;
        drawRectangle(width, height);
        System.out.println("\n ----------------------------------\n");
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
