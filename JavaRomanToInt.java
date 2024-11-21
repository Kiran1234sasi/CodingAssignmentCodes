import java.util.*;

public class JavaRomanToInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Enter a Roman number : ");
        String roman = scanner.nextLine();
    
        int integerValue = romanToInt(roman);
        
        System.out.println("The integer value is: " + integerValue);
        
        scanner.close();
    }
    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int total = 0;
        int prevValue = 0;

        int n = s.length();
        for (int i = n - 1; i >= 0; i--) {
            char currentChar = s.charAt(i);
            int currentValue = map.get(currentChar);
		System.out.println(currentValue);
            if (currentValue < prevValue) {
                total -= currentValue;
            } else {
                total += currentValue;
            }
            prevValue = currentValue;
        }
        return total;
    }
}