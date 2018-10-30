import static java.lang.Math.PI;

public class CircleImpl extends figurenManager.Circle {
    public CircleImpl(int r) {
        super(r);
    }

    private int r;

    public int getR(){
        return this.r;
    }

    @Override
    public double area() {
        double flaeche = PI * r * r;
        return flaeche;
    }
    @Override
    public double circumference() {
        double umfang = PI * 2 * r;
        return umfang;
    }

        String output() {
        return null;
    }
}
