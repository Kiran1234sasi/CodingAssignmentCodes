import java.util.*;

public class JavaIsPanagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

	System.out.print("Enter the input : ");
        String str = scanner.nextLine();
        
        boolean isPanagram = checkPanagram(str);
        
        if(isPanagram)
            System.out.println("The Given Input is Panagram");
        else
            System.out.println("The Given Input is not an Panagram");
    }
    public static boolean checkPanagram(String str){
        Set<Character> set = new HashSet<>();
        char[] arr = str.toCharArray();
        
        for(char ch : arr){
            if(Character.isLetter(ch)){
                set.add(ch);
            }
        }
        return set.size() == 26;
    }
}


