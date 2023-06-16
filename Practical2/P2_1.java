import java.util.Scanner;

public class P2_1 {

    private static final int VOWEL = 0;
    private static final int CONSONANT = 1;

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text : ");
        String text = sc.nextLine();
        sc.close();

        int vowels = 0;
        int consonants = 0;
        for (int i = 0; i < text.length(); i++)
        {
            int flag = check(text.charAt(i));

            switch (flag)
            {
                case VOWEL : 
                    vowels++;
                    break;
                case CONSONANT : 
                    consonants++;
            }
        }

        System.out.println("Total Vowels in text = " + vowels);
        System.out.println("Total Consonants in text = " + consonants);
        
    }

    private static int check(char c)
    {
        c = Character.toUpperCase(c);
        switch (c)
        {
            case 'A' :
            case 'E' :
            case 'I' : 
            case 'O' : 
            case 'U' : 
                return VOWEL;
        }

        if (Character.isAlphabetic(c))
            return CONSONANT;
        else
            return -1;
    }
}
