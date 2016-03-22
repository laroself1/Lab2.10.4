public class Triangle extends Shape implements Drawable{
    private  double a;
    private  double b;
    private  double c;

    public double getA() {   return a; }
    public void setA(double a) {  this.a = a; }
    public double getB() {  return b;  }
    public void setB(double b) { this.b = b;  }
    public double getC() {    return c;  }
    public void setC(double c) {   this.c = c;  }

    public Triangle(String color, double a, double b, double c){
        super(color);
        setA(a);
        setB(b);
        setC(c);
    }

    @Override
    public String toString() {
        return "This is Triangle, " +  "color: "+super.getShapeColor()+
                " a=" + a +
                ", b=" + b +
                ", c=" + c;    }
    @Override
    public double calcArea(){
        double S = (getA()+getB()+getC())/2;
        double area = Math.sqrt(S*(S-getA())*(S-getB())*(S-getC()));
        return area;}

    @Override
    public void draw(){System.out.println(this.toString() + ", Triangle area is: " + this.calcArea());}
}
