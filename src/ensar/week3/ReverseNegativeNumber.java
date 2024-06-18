package ensar.week3;

public class ReverseNegativeNumber {

    public static void main(String[] args) {
        
        int output = reverseNegative(-100);

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
