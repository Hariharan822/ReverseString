import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] numbers = {1,2,4,7,4,9,3,5};
        int result = secondLargest(numbers);
        
        System.out.println("The second largest number is " + result);
    }

    public static int secondLargest(int[] numbers) {
        if(numbers.length < 2) {
            throw new IllegalArgumentException("Array must contain atleast two elements");
        }

        Arrays.sort(numbers);

        int largest = numbers[numbers.length - 1];
        for(int i = numbers.length - 2; i >= 0; i--) {
            if (numbers[i] != largest) {
                return numbers[i];
            }
        }
            throw new IllegalArgumentException("Array must contain atleast two distinct elements");
    }
}
