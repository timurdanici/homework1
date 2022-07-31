import org.w3c.dom.ls.LSOutput;

public class Main {
//        static int calculate (int a, int b){
//            return (a*b)-3;
//        }

    static int resolveSquare(int a, int b, int c){
        int D=b^2 + -4*a*c;
//      double x1= (-b + Math.sqrt(D))/ (2 * a);
//      double x2= (-b - Math.sqrt(D))/ (2 * a);
        return D;
    }
   

    public static void main(String[] args) {
//        int x=15;
//        byte y=5;
//        short z=8;
//        System.out.println("x + y + z = "+ (x + y + z));
//        System.out.println("x * y * z = "+ (x * y * z));
//        System.out.println("x / y = "+ (x / y));
//      int c = calculate(18, 52);
//      System.out.println(c);
        int f= resolveSquare(1,2,-3);
        System.out.println(f);
    }


}


