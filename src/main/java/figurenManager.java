public class figurenManager {
    public static void main(String[] args) {

        Figur[] figur = new Figur[5];

        Ellipse ellipse = new Ellipse();
        Rechteck rechteck = new Rechteck();
        Square square = new Square();
        Triangle triangle = new Triangle();
        Circle circle = new Circle();

        figur[0] = ellipse;
        figur[1] = rechteck;
        figur[2] = square;
        figur[3] = triangle;
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
}
