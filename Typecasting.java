import java.util.Scanner;
public class Typecasting {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        double m = (double) n; // here we are putting the integers value in double
//        System.out.println(m/2);

        //the commented part showing half of odd integer in double format


        double x = sc.nextDouble();
        int y = (int) x;
        System.out.println(y);

        // int/int = int
        // double/double = double
        // int/double = double
        // double/int = double
    }
}
