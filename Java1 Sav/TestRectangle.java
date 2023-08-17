public class TestRectangle {
    public static void main(String[] args) {
        MyPoint topLeft = new MyPoint(1, 5);
        MyPoint bottomRight = new MyPoint(6, 2);

        MyRectangle rectangle = new MyRectangle(topLeft, bottomRight);

        System.out.println("Rectangle: " + rectangle.toString());
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());

        MyPoint newTopLeft = new MyPoint(0, 7);
        rectangle.setTopLeft(newTopLeft);

        System.out.println("Rectangle Updated!: " + rectangle.toString());
    }
}

