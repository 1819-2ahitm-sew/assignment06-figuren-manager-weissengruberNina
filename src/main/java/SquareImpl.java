public class SquareImpl extends figurenManager.Square {
    private int s;

    public int getS(){
        return this.s;
    }


    double area() {
        double flaeche = s * s;
        return flaeche;
    }

    double circumference() {
        double umfang= 4 * s;
        return umfang;
    }

    String output() {

        return null;
    }
}
