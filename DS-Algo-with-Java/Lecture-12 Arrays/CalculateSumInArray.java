public class CalculateSumInArray {
    public static void main(String[] args) {
        int arr[] = {1, 5, 3};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println(sum);
    }
}
