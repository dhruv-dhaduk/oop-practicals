import java.io.*;
import java.util.Scanner;

public class P8_1
{
    public static void main(String[] args)
    {
        if (args.length != 2)
        {
            System.out.println("Usage : java P8_1 word filepath");
            return;
        }

        String word = args[0];

        String filePath = args[1];
        

        File inFile = new File(filePath);
        File outFile = new File("output.txt");
        
        Scanner in;
        PrintWriter out;

        try {
            in = new Scanner(inFile);
            out = new PrintWriter(outFile);
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            return;
        }

        while (in.hasNextLine())
        {
            Scanner sc = new Scanner(in.nextLine());
            while (sc.hasNext())
            {
                String s = sc.next();
                if (!s.equals(word))
                {
                    out.print(s);
                    out.print(" ");
                }
            }
            out.println();
        }

        out.flush();

        in.close();
        out.close();

        System.out.println("See your output in 'output.txt' file in current directory.");
    }
}