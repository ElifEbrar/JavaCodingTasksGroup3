package ensar.week7;

public class FindMinimum {

    public static void main(String[] args) {
        int[] givenArray = {99, 12, 23, 32, 44, 57, 6};

        System.out.println(findMinimum(givenArray));
    }

    private static int findMinimum(int[] intArr) {
        if (intArr.length == 0) {
            System.err.print("The array cannot be empty!");
            System.exit(1);
        } else if (intArr.length == 1) {
            return intArr[0];
        }

        int result = intArr[0];

        for (int i = 1; i < intArr.length; i++) {

            if (intArr[i] < result) {
                result = intArr[i];
            }
        }

        return result;
    }

}
