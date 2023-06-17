import java.util.HashMap;
import java.util.Scanner;

public class P10_3 {
    public static void main(String[] args) {
        
        HashMap<String, String> map = new HashMap<>();
        
        
        map.put("andhra pradesh", "Hyderabad");
        map.put("arunachal aradesh", "Itanagar");
        map.put("assam", "Dispur");
        map.put("bihar", "Patna");
        map.put("goa", "Panaji");
        map.put("gujarat", "Gandhinagar");
        map.put("haryana", "Chandigarh");
        map.put("karnataka", "Bengaluru");
        map.put("kerala", "Thiruvananthapuram");
        map.put("maharashtra", "Mumbai");
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a state: ");
        String state = sc.nextLine();
        sc.close();
        
        String capital = map.get(state.toLowerCase());
        
        if (capital != null) {
            System.out.println("Capital of " + state + " is " + capital);
        } else {
            System.out.println("Capital not found for the entered state.");
        }
    }
}
