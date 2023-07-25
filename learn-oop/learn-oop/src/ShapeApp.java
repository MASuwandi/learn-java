
public class ShapeApp {
    public static void main(String[] args) {

        var shape = new Shape();

        System.out.println("get corner: " + shape.getCorner());

        var rectangle = new Rectangle();

        System.out.println("get corner: " + rectangle.getCorner());
        System.out.println("get parent corner: " + rectangle.getParentCorner());
    }
}
