import java.util.Scanner;

public class P1_2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter v0, v1 and t : ");
        float v0 = sc.nextFloat();
        float v1 = sc.nextFloat();
        float t = sc.nextFloat();

        sc.close();

        float a = (v1 - v0) / t;

        System.out.println("Acceleration = " + a);
    }
}
