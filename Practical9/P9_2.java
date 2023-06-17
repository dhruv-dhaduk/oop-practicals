import java.util.ArrayList;
import java.util.Scanner;

public class P9_2
{
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<String>();

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++)
        {
            System.out.print("Enter list item #" + i + " : ");
            String s = sc.nextLine();
            list.add(s);
        }
        sc.close();

        ArrayList<String> noDuplicate = removeDuplicates(list);

        System.out.println("New List containing no duplicates : ");
        for (String s : noDuplicate)
        {
            System.out.print(s + " ");
        }
    }

    
    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
        ArrayList<E> newList = new ArrayList<>();
        
        for (E element : list) {

            if (!newList.contains(element))
            {
                newList.add(element);
            }
        }
        
        return newList;
    }
}