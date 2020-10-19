public class Arrays {
    public static void main (String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        double[] arrayDouble = {1.1, 2.2, 3.3, 4.4};
        System.out.println(arraySum(array));
        System.out.println(arraySum(arrayDouble));
    }

    private static int arraySum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    private static double arraySum(double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
}
