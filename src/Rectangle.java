

public class Rectangle extends Shape implements Drawable,Comparable {
    private  double height;
    private   double width;

    public double getHeight() {  return height; }
    public void setHeight(double height) {  this.height = height;  }
    public double getWidth() {   return width;   }
    public void setWidth(double width) {    this.width = width;  }

    public Rectangle(String color, double width, double height){
        super(color);
        setWidth(width);
        setHeight(height);    }

    @Override
    public double calcArea(){double area = getHeight()*getWidth();

        return area;}
    @Override
    public String toString() {
        return "This is Rectangle" + ", color: "+ super.getShapeColor()+
                " height=" + height +
                ", width=" + width     ;
    }
    @Override
    public void draw(){System.out.println(this.toString() + ", Rectangle area is: " +  calcArea());}

    @Override

    public int compareTo(Object o){
        Rectangle R = (Rectangle)o;
        if (this.calcArea()>R.calcArea()){return -1;};
        if (this.calcArea()<R.calcArea()){return 1;}
        return 0;}
/*
   Comparator<Locale> localeComparator = new Comparator<Locale>() {
       @Override
       public int compare(Locale o1, Locale o2) {
           return 0;
       }
   }*/
}
