package Berkay.week03;

public class PrimeNumber {
    public static void main(String[] args) {
        primeNumber(667);

    }

    public static void primeNumber (int input){
        boolean isprimenumber=false;
        if (input==2){
            isprimenumber=true;
        } else if (input==1) {
            isprimenumber=false;

        }else for (int i = 2; i <input ; i++) {
            if (input%i==0){
                isprimenumber=false;
                break;
            }else isprimenumber=true;

        }
        System.out.println("isprimenumber = " + isprimenumber);
        System.out.println((isprimenumber==true)?"The Number is PRIME":"The Number is not PRIME");
    }
}
