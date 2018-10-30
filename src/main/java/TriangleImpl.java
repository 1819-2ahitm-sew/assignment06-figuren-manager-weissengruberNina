public class TriangleImpl extends figurenManager.Triangle {
    public TriangleImpl(int length, int width) {
        super(length, width);
    }

    private int length;
    private int width;

    public int getLength(){
        return this.length;
    }

    public int getWidth(){
        return this.width;
    }

    @Override
    public double area() {
        double flaeche = 3;
        return flaeche;
    }

    @Override
    public double circumference(){
        double umfang= length + width;
        return umfang;
    }

    String output() {
        return null;
    }
}
