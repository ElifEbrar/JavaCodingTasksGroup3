package ensar.week6;

public class FindMaximum {

    public static void main(String[] args) {
        int[] givenIntArray = {};

        System.out.println(maxNumber(givenIntArray));
    }

    private static int maxNumber(int[] numArr) {
        if (numArr.length == 0) {
            System.err.print("The array cannot be empty!");
            System.exit(1);
        } else if (numArr.length == 1) {
            return numArr[0];
        }

        int result = numArr[0];

        for (int i = 1; i < numArr.length; i++) {

            if (numArr[i] > result) {
                result = numArr[i];
            }
        }

        return result;
    }

}
