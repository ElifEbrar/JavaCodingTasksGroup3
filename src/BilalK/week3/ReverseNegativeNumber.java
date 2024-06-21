package BilalK.week3;

public class ReverseNegativeNumber {
    /*
    2️⃣ Numbers - Reverse Negative Number
Write a return method that can reverse digits of a negative number and return it as int
input: -35  output: -53
     */
    public static void main(String[] args) {
        int output = reverseNegative(-115);

        System.out.println(output);

    }

    static int reverseNegative(int num) {

        String numString = String.valueOf(num);
        String result = "-";
        int digitNum = -1;

        for (char eachChar : numString.toCharArray()) {
            digitNum++;
        }

        for (int i = digitNum; i > 0; i--) {
            result += numString.charAt(i);
        }

        return Integer.parseInt(result);

    }

}


//    static void AbsoluteValue(int number) {
//
//        int n = -35; // Örnek negatif sayı
//        int absolute = Math.abs(n);
//        System.out.println("absolute = " + absolute);
////        String absValue = String.valueOf(input);
////
////        System.out.println("absValue = " + absValue);
////
////
////        System.out.println(reversed);


