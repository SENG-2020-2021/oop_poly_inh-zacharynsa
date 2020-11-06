import java.util.Scanner;
//Complete this program that the user will be able to choose the quadilateral it wants to calculate its perimeter and area

class Main {
  public static void main(String[] args) {
   //Complete this program that the user will be able to choose the quadilateral it wants to calculate its perimeter and area



                //Declare a char to store the chosen quadilateral

                //using a switch check what the user selected and use it to calculate the perimeter and area of the desired quadilateral

                //this should be in the parallelogram case


                System.out.println("This program calculates the area and perimeter of the parallelogram.");

                System.out.println("Input the base of your Parallelogram");
                Scanner scan = new Scanner(System.in);
                float pBase = scan.nextFloat();

                System.out.println("Input the height of your Parallelogram");
                float pHeight = scan.nextFloat();
                Parallelogram p = new Parallelogram(pBase, pHeight);

                Quadilateral q = p;


                System.out.println("Input the dimension of the first pair of your Parallelogram");
                q.setLength(scan.nextFloat());
                System.out.println("Input the second pair of your Parallelogram");
                q.setBreadth(scan.nextFloat());

                System.out.printf("The area of the parallelogram with base %.2f and height %.2f is %.2f", pBase, pHeight, p.Area());

                System.out.println("p.Area");
                System.out.printf("The perimeter of the parallelogram with First Pair: %.2f and SecondPair: %.2f is %.2f", q.getLength(), q.getBreadth(), q.calculatePerimeter());
                System.out.println("");
                System.out.println("");
                System.out.println("");

                //this should be in the Trapezoid case
                System.out.println("Calculation for a Trapezoid");
                System.out.println("Input first side");
                float a = scan.nextFloat();
                System.out.println("Input second side");
                float b = scan.nextFloat();
                System.out.println("Input third side");
                float c = scan.nextFloat();
                System.out.println("Input fourth side");
                float d = scan.nextFloat();
                Trapezoid t = new Trapezoid(a, b, c, d);
                System.out.printf("The perimeter of the Trapezoid with First Side: %.2f, Second Side: %.2f, Third Side: %.2f, and Fourth Side: %.2f is %.2f \n ", a, b, c, d, t.calculatePerimeter());


//for rhombus
        System.out.println("\n area and perimeter of a rhombus ");
        System.out.println("\n  input side number");
        float sides1 = scan.nextFloat();
        System.out.println("\n  input p");
        float P = scan.nextFloat();
        System.out.println(" \n input q");
        float Q = scan.nextFloat();
        Rhombus w = new Rhombus(sides1, P, Q);

        System.out.printf("The perimeter of the rhombus with sides1 %.2f  is %.2f", sides1, w.calculatePerimeter());
        System.out.println("p.Area");
        System.out.printf("The area of the parallelogram with First Pair: %.2f and SecondPair: %.2f is %.2f", P, Q, w.Area());


//for square
        System.out.println("\n area and perimeter of a square");
        System.out.println("input first value ");
        float aa = scan.nextFloat();
        System.out.println("input second value");
        float bb = scan.nextFloat();
        square r = new square(aa, bb);
        System.out.println("\n perimeter");
        System.out.println( r.calculatePerimeter());
        System.out.println("\n area");
        System.out.println( r.Area());

        // for rectangle
        System.out.println("\n area and perimeter of a rectangle ");
        System.out.println("input first value ");
        double d1 = scan.nextDouble();
        System.out.println("\n input second value ");
        double d2 = scan.nextDouble();
        Rectangle u = new Rectangle(d1, d2);
        System.out.println("\n perimeter");
        System.out.println(u.Perimeter());
        System.out.println("\n area");
        System.out.println(u.Area());
    }
        }

//Create class for Rhombus
        class Rhombus extends Quadilateral{
        private float parts;
        private float part2;
        private float part3;



    public Rhombus(float sides1, float P, float Q ) {
        parts = sides1;
        part2 = P;
        part3 = Q;


    }
    public float calculatePerimeter(){
        return parts*4 ;
    }
    public float Area(){
        return part2*part3/2;
    }



}


//Create class for square
   class square extends Quadilateral{
     private float rem1;
     private float rem2;


    public square(float aa, float bb) {
    rem1 =aa;
    rem2 = bb;

    }
    public float calculatePerimeter(){
        return 4*rem1;
    }
    public float Area(){
        return rem1*rem2;
    }
}



//create class for Rectangle
 class Rectangle extends Quadilateral{
  private double yes1;
  private double yes2;
    public Rectangle(double d1, double d2) {
        yes1 =d1;
        yes2 =d2;
    }
    public double Perimeter(){
        return 2*(yes1+yes2);
    }
    public double Area(){
        return yes1*yes2;
    }
}

        class Trapezoid extends Quadilateral{
            private float side1;
            private float side2;
            private float side3;
            private float side4;
            public Trapezoid (float a, float b, float c, float d){
                side1 = a;
                side2 = b;
                side3 = c;
                side4 = d;
            }

            public float calculatePerimeter(){
                return side1+side2+side3+side4;
            }
        }
        class Parallelogram extends Quadilateral{
            private float base;
            private float height;
            public Parallelogram (float b, float h){
                if (b <= 0){
                    System.out.println("You cannot have a negative or zero base. Therfore base returns to default which is 1");
                    base = 1;
                }
                else
                    base = b;
                if (h <= 0){
                    System.out.println("You cannot have a negative or zero height. Therfore height returns to default which is 1");
                    height = 1;
                }
                else
                    height = h;
            }
            public float Area(){
                return base*height;
            }

        }
        class Quadilateral {
            private float length;
            private float breadth;

            public void setLength(float l){
                length = l;
            }

            public float getLength(){
                return length;
            }

            public void setBreadth(float b){
                breadth = b;
            }

            public float getBreadth(){
                return breadth;
            }

            public float calculatePerimeter(){
                return 2*(length+breadth);
            }
        }
