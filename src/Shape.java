import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public abstract class Shape implements Drawable {

    private String shapeColor;

    public String getShapeColor() {
        return shapeColor;
    }

    public Shape(String shapeColor) {
        this.shapeColor = shapeColor.toUpperCase();
    }

    @Override
    public String toString() {
        return "Shape color is " + shapeColor;
    }

    public abstract double calcArea();

    //2.10.4
    public static void parseShape(String str) throws InvalidShapeStringException {
        StringTokenizer st = new StringTokenizer(str, ":, ");
        String shapeType = st.nextToken();

        if (!(shapeType.equals("Rectangle")| shapeType.equals("Triangle") | shapeType.equals("Circle")) ){throw new InvalidShapeStringException();}

        switch (shapeType){
            case ("Rectangle"):

                String rectangleRegExp = "(Rectangle):[A-Z|a-z]+:\\d+,\\d+";
                Pattern rectanglePat = Pattern.compile(rectangleRegExp);
                Matcher rectangleMat = rectanglePat.matcher(str);

                if (!rectangleMat.matches()){ throw new InvalidShapeStringException();}

                String recColor = st.nextToken();
                double recHeight = Double.parseDouble(st.nextToken());
                double recWidth = Double.parseDouble(st.nextToken());
                System.out.println(new Rectangle(recColor, recHeight, recWidth));
                break;

            case ("Triangle"):
                String triangleRegExp = "(Triangle):[A-Z|a-z]+:\\d+,\\d+,\\d+" ;
                Pattern trianglePat = Pattern.compile(triangleRegExp);
                Matcher triangleMat = trianglePat.matcher(str);

                if(!triangleMat.matches()) {throw new InvalidShapeStringException();}

                String triColor = st.nextToken();
                double a = Double.parseDouble(st.nextToken());
                double b = Double.parseDouble(st.nextToken());
                double c = Double.parseDouble(st.nextToken());
                System.out.println(new Triangle(triColor,a, b,c));
                break;

            case ("Circle") :
                String cirleRegExp = "(Circle):[A-Z|a-z]+:\\d+";
                Pattern circlePat = Pattern.compile(cirleRegExp);
                Matcher circleMat = circlePat.matcher(str);

                if(!circleMat.matches()) {throw new InvalidShapeStringException();}

                String cirColor = st.nextToken();
                double radius = Double.parseDouble(st.nextToken());
                System.out.println(new Circle(cirColor, radius));
                break;
        }}}




