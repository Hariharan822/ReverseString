public class SumOfElements {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        int sum = sumOfArray(numbers);
        System.out.println("The sum of elements in the array is " + sum);
    }

    public static int sumOfArray(int[] numbers) {
        int sum = 0;
        for(int i = 0; i < numbers.length ; i++) {
            sum += numbers[i];
        }
        return sum;
    }
}
