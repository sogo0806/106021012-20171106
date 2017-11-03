
import java.util.Scanner;

public class hw2 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int v1 = sca.nextInt();
        if (v1 % 4 == 0) {
            if (v1 % 100 == 0) {
                if (v1 % 400 == 0) {
                    System.out.println("Bissextile Year");
                } else {
                    System.out.println("Commom Year");
                }
            }
        }else {
            System.out.println("Commom Year");
        }

    }
}