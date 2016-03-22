
public class Circle extends Shape implements Drawable,Comparable{
    private  double R;

    public double getRadius() {  return R;  }
    public void setRadius(double radius) { this.R = radius; }
    public Circle (String color, double radik){
        super(color);
        this.R= radik;}


    @Override
    public double calcArea() {
        return Math.PI*Math.pow(R,2);
    }

    @Override
    public String toString() {
        return "This is circle: " + "color: "+ super.getShapeColor()+", R=" + R;
    }
    @Override
    public void draw() {System.out.println(this.toString()+ ", Circle area is: "+ calcArea());}
    @Override
    public int compareTo(Object o) {
        Circle L = (Circle) o;
        if (this.calcArea() < L.calcArea()) return -1;
        if (this.calcArea() > L.calcArea()) return 1;
        return 0;
    }
};
