import java.util.Scanner;

public class P6_1
{
    public static void main(String[] args)
    {
        int list[] = new int[100];

        fillRandom(list, 10000);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the index(0-99) : ");
        int index = sc.nextInt();
        sc.nextLine();

        sc.close();

        try
        {
            int num = list[index];
            System.out.println("list[" + index + "] = " + num);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Index Out of Bound");
        }


    }

    private static void fillRandom(int[] list, int n)
    {
        for (int i = 0; i < list.length; i++)
        {
            list[i] = (int) (n * Math.random());
        }
    }
}