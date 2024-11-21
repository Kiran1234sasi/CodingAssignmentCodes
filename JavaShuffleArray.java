import java.util.Arrays;
import java.util.Random;

public class JavaShuffleArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 7, 9};
        
        shufflingArray(arr);
        
    System.out.println("Shuffled Array: " + Arrays.toString(arr));
    }
    public static void shufflingArray(int[] array) {
        Random random = new Random();
        int n = array.length;
        for (int i = n - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
    
    
}