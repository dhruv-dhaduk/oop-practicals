import java.util.Scanner;

public class P9_3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String[] list = new String[10];
        for (int i = 0; i < 10; i++)
        {
            System.out.print("Enter list item #" + i + " : ");
            list[i] = sc.nextLine();
        }
        System.out.println();

        System.out.print("Enter string to search : ");
        String key = sc.nextLine();
        sc.close();
        int index = binarySearch(list, key);
        System.out.println("Index : " + index);
    }

    public static <E extends Comparable<E>> int binarySearch(E[] list, E key) {
        int low = 0;
        int high = list.length - 1;
        
        while (low <= high) {
            int mid = (low + high) / 2;
            int comparison = key.compareTo(list[mid]);
            
            if (comparison == 0) 
            {
                return mid;
            } 
            else if (comparison < 0) 
            {
                high = mid - 1;
            } 
            else 
            {
                low = mid + 1;
            }
        }
        
        return -1;
    }
}