import static java.lang.Math.PI;

public class EllipseImpl extends figurenManager.Ellipse {
    public EllipseImpl(int hA, int nA) {
        super(hA, nA);
    }

    private int hA;
    private int nA;


    public int getHA(){
        return this.hA;
    }

    public int getNA(){
        return this.nA;
    }
    @Override
    public double area() {
        double flaeche = PI * hA * nA;
        return flaeche;
    }
    @Override
    public double circumference(){
        double umfang= 4;
        return umfang;
    }

    String output() {
        return null;
    }
}
