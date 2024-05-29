package Berkay.Week_1;

public class numbersOddorEven {
    public static void main(String[] args) {

        System.out.println(oddorEven(23));
        String sonuc= oddorEven(24);
        System.out.println("sonuc = " + sonuc);

    }

    public static String oddorEven (int num){
        String result="";
        if (num%2==0){
            result="Even";
        }else result="Odd";

       return result;
    }
}
