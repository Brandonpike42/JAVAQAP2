public class TestMyLine {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(1, 2);
        MyPoint p2 = new MyPoint(4, 6);
        MyLine line = new MyLine(p1, p2);

        System.out.println(line);
        System.out.println("Begin X: " + line.getBeginX());
        System.out.println("Begin Y: " + line.getBeginY());
        System.out.println("End X: " + line.getEndX());
        System.out.println("End Y: " + line.getEndY());

        System.out.println("Begin XY: " + java.util.Arrays.toString(line.getBeginXY()));
        System.out.println("End XY: " + java.util.Arrays.toString(line.getEndXY()));

        System.out.println("Length: " + line.getLength());
        System.out.println("Gradient: " + line.getGradient());

        line.setBeginXY(0, 0);
        line.setEndXY(3, 4);

        System.out.println("\nAfter updating points:");
        System.out.println(line);
        System.out.println("Length: " + line.getLength());
        System.out.println("Gradient: " + line.getGradient());
    }
}
