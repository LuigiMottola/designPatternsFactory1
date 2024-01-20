public class Rhombus implements Shape{
    private ShapeEnum shapeType;
    public Rhombus(){
        this.shapeType = ShapeEnum.RHOMBUS;
    }
    @Override
    public void draw() {
        System.out.println(ShapeEnum.RHOMBUS + "\n");
        int side = 5;
        drawRhombus(side);
        System.out.println("\n ----------------------------------\n");
    }
    static void drawRhombus(int side) {
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = side - 2; i >= 0; i--) {
            for (int j = 0; j < side - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
