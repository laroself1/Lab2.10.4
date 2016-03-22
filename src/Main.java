import java.util.Scanner;

public class Main{

    public static void main(String[] args)  {

        // checking how parseShape works

    /*try { Shape.parseShape("Rectangle:RED:10,30,10");
}catch (InvalidShapeStringException e){ System.out.println(e.getMessage());}

try {Shape.parseShape("Rectangle:RED:10,20");
}catch (InvalidShapeStringException e){ System.out.println(e.getMessage());}

try{Shape.parseShape("aajajjaja");
}catch (InvalidShapeStringException e){ System.out.println(e.getMessage());}

try {Shape.parseShape("Triangle:RED:10,20,30");
}catch (InvalidShapeStringException e){ System.out.println(e.getMessage());}

try {Shape.parseShape("Triangle:RED:10,20");
}catch (InvalidShapeStringException e){ System.out.println(e.getMessage());}

try {Shape.parseShape("Circle:red,454,4");
    Shape.parseShape("Circle:BLUE:20");
      }
catch (InvalidShapeStringException e){ System.out.println(e.getMessage()); }
*/
        System.out.println("How much Shapes are you going to create? (even number only)");
        Scanner n = new Scanner(System.in);
        int shapeNumber = Integer.parseInt( n.nextLine());

        System.out.println("Enter data to create shape");

        for (int i=shapeNumber; i>0; i--){
            Scanner s =new Scanner(System.in);
            String ins = s.nextLine();
            try{
                Shape.parseShape(ins);}
            catch (InvalidShapeStringException e){
                System.out.println(e.getMessage());}
        }
    }}