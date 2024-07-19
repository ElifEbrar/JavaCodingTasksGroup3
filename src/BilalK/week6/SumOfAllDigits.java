package BilalK.week6;

public class SumOfAllDigits {
    public static int sumOfDigits(String str) {
        int sum = 0;
        String temp = "";

        // String içindeki her karakteri kontrol et
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Eğer karakter bir rakam ise, geçici stringe ekle
            if (Character.isDigit(ch)) {
                temp += ch;
            } else {
                // Eğer karakter rakam değilse ve geçici string doluysa, geçici stringi sayıya çevir ve toplama ekle
                if (!temp.equals("")) {
                    sum += Integer.parseInt(temp);
                    temp = "";
                }
            }
        }

        // Son rakamları ekle
        if (!temp.equals("")) {
            sum += Integer.parseInt(temp);
        }

        return sum;
    }

    public static void main(String[] args) {
        // Test örneği
        String input = "12 java 5 apple 3";
        int result = sumOfDigits(input);
        System.out.println("The sum of the digits in the string is: " + result); // 20
    }
}

/*
1️⃣  String_SumOfAllDigits
Write a method that can return the sum of the digits in a string
Ex:  "12 java 5 apple 3"  ==>  20
 */