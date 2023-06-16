import java.util.Scanner;

public class P2_5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int l = sc.nextInt();
        sc.nextLine();

        int list[] = new int[l];

        initialize(list, sc);

        sc.close();

        int index = indexOfSmallestElement(list);

        System.out.println("Index of the smallest element : " + index);
    }

    private static int indexOfSmallestElement(int[] list)
    {
        int min = 0;

        for (int i = 0; i < list.length; i++)
        {
            if  (list[i] < list[min])
                min = i;
        }

        return min;
    }

    private static void initialize(int list[], Scanner sc)
    {
        if (sc == null)
            sc = new Scanner(System.in);

        System.out.println("For this array of size : " + list.length);

        for (int i = 0; i < list.length; i++)
        {
            System.out.print("Enter #" + i + " : ");
            list[i] = sc.nextInt();
            sc.nextLine();
        }

    }

}