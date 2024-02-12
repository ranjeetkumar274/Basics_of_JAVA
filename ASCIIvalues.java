import java.util.Scanner;
public class ASCIIvalues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //how we taking input of character in java

        char ch = sc.next().charAt(0);

        //printing ASCII values of the character
        int x = (int)ch;
        System.out.println(x);

    }
}
