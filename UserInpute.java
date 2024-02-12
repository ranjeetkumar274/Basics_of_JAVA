import java.util.Scanner;
public class UserInpute {
    public static void main(String[] args) {
        double pi = 3.141592;
        //taking input from user
        //square of an integer
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius : ");
        float r = sc.nextFloat();
        System.out.print("The area  is : ");
        double a = pi*r*r;
        System.out.println(a);


    }
}
