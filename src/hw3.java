
import java.util.Scanner;

public class hw3 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int v1 = sca.nextInt();
        if (v1 > 0 && v1 < 13) {
            if (v1 > 2 && v1 < 6) {
                System.out.println("Spring");
            }
            if (v1 > 5 && v1 < 9) {
                System.out.println("Summer");
            }
            if (v1 > 8 && v1 < 12) {
                System.out.println("Autumn");
            }
            if (v1 < 3 || v1 == 12) {
                System.out.println("Winter");
            }
        } else {
            System.out.println("error");
        }
    }
}