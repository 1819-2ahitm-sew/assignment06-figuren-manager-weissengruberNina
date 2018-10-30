public class figurenManager {
    public static void main(String[] args) {

        Figur[] figur = new Figur[5];


        Triangle triangle = new Triangle(10, 6);
        Rectangle rectangle = new Rectangle(8,2);
        Square square = new Square(7);
        Ellipse ellipse = new Ellipse(9, 5);
        Circle circle = new Circle(4);

        figur[0] = triangle;
        figur[1] = rectangle;
        figur[2] = square;
        figur[3] = ellipse;
        figur[4] = circle;

        System.out.println("Datenanzeige: ");
        System.out.println("-------------");

        System.out.println(figur[0].area());
        System.out.println(figur[1].area());
        System.out.println(figur[2].area());
        System.out.println(figur[3].area());
        System.out.println(figur[4].area());


        for (int k = 0; k < figur.length; k++) {
            System.out.println(figur[k]);
            System.out.printf("Fläche -> "+figur[k].area());
            System.out.printf("Umfang -> "+figur[k].circumference());
        }
    }

    abstract class Figur {


        abstract double area();
        abstract double circumference();
        abstract String output();
    }

    public class Triangle extends Figur{

        public Triangle(int length, int width) {
            super();
        }

        double area() {
            return 0;
        }

        double circumference() {
            return 0;
        }

        String output() {
            return null;
        }
    }

    public class Rectangle extends Figur {

        public Rectangle(int length, int width) {
            super();
        }

        double area() {
            return 0;
        }

        double circumference() {
            return 0;
        }

        String output() {
            return null;
        }
    }

    public class Square extends Figur {

        public Square(int s) {
            super();
        }

        double area() {
            return 0;
        }

        double circumference() {
            return 0;
        }

        String output() {
            return null;
        }
    }

    public class Ellipse extends Figur {

        public Ellipse(int hA, int nA) {
            super();
        }

        double area() {
            return 0;
        }

        double circumference() {
            return 0;
        }

        String output() {
            return null;
        }
    }

    public class Circle extends Figur {
        public Circle(int r) {
            super();
        }

        double area() {
            return 0;
        }

        double circumference() {
            return 0;
        }

        String output() {
            return null;
        }
    }
    }
