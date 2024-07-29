import java.util.Arrays;

public class SameElements {
    public static void main (String[] args) {
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {5,4,3,2,1};
        boolean ifEqauls = equals(array1, array2);
        if (ifEqauls) {
            System.out.println("Same elements");
        }
        else {
            System.out.println("Elements are not same");
        }
    }

    public static boolean equals (int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        Arrays.sort(array1);
        Arrays.sort(array2);

        for(int i = 0; i < array1.length ; i++) {
            if(array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }
}
