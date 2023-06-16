import java.util.Scanner;
import java.util.ArrayList;

public class P2_4
{
    public static void main(String[] args)
    {
        int list[] = new int[10];

        initialize(list);
        
        int eliminated[] = eliminateDuplicates(list);

        printArray(list, "Before : ");
        printArray(eliminated, "After  : ");
    }

    private static int[] eliminateDuplicates(int[] list)
    {
        ArrayList<Integer> tempList = new ArrayList<Integer>();

        for (int i = 0; i < list.length; i++)
        {
            if (!tempList.contains(list[i]))
            {
                tempList.add(list[i]);
            }
        }

        int[] eliminated = new int[tempList.size()];

        for (int i = 0; i < eliminated.length; i++)
        {
            eliminated[i] = (int) tempList.get(i);
        }

        return eliminated;
    }

    private static void initialize(int list[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("For this array of size : " + list.length);

        for (int i = 0; i < list.length; i++)
        {
            System.out.print("Enter #" + i + " : ");
            list[i] = sc.nextInt();
            sc.nextLine();
        }

        sc.close();
    }

    private static void printArray(int list[], String message)
    {
        System.out.print(message + "[");

        int l = list.length;

        for (int i = 0; i < l; i++)
        {
            if (i < l - 1)
                System.out.print(list[i] + ", ");
            else
                System.out.print(list[i] + "]");
        }

        System.out.println();
    }
}