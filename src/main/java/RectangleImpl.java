public class RectangleImpl extends figurenManager.Rectangle {
    public RectangleImpl(int length, int width) {
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
        double flaeche = length * width;
        return flaeche;
    }
    @Override
    public double circumference(){
        double umfang= 2 * (length + width);
        return umfang;
    }

    String output() {
        return null;
    }
}
