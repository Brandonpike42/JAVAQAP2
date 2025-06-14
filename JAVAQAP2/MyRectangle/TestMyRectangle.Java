public class TestMyRectangle {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(1, 5);  // Top-left
        MyPoint p2 = new MyPoint(6, 1);  // Bottom-right

        MyRectangle rect = new MyRectangle(p1, p2);

        System.out.println(rect);
        System.out.println("Width: " + rect.getWidth());
        System.out.println("Height: " + rect.getHeight());
        System.out.println("Area: " + rect.getArea());
        System.out.println("Perimeter: " + rect.getPerimeter());

        // Update rectangle corners
        rect.setTopLeft(new MyPoint(0, 10));
        rect.setBottomRight(new MyPoint(10, 0));

        System.out.println("\nAfter update:");
        System.out.println(rect);
        System.out.println("Width: " + rect.getWidth());
        System.out.println("Height: " + rect.getHeight());
        System.out.println("Area: " + rect.getArea());
        System.out.println("Perimeter: " + rect.getPerimeter());
    }
}

