import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class P8_2
{
    public static void main(String[] args)
    {
        if (args.length != 1)
        {
            System.out.println("Usage : java P8_2 filepath");
            return;
        }

        String filePath = args[0];

        File inFile = new File(filePath);
        
        Scanner in;

        try {
            in = new Scanner(inFile);
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            return;
        }

        int characters = 0;
        int words = 0;
        int lines = 0;

        while (in.hasNextLine())
        {
            Scanner sc = new Scanner(in.nextLine());
            while (sc.hasNext())
            {
                String s = sc.next();
                characters += s.length();
                words++;
            }
            lines++;
        }
        in.close();

        System.out.println("Total Characters : " + characters);
        System.out.println("Words : " + words);
        System.out.println("Lines : " + lines);
    }
}