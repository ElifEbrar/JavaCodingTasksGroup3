package Berkay.week01;

public class numbersDivideOperator {
    public static void main(String[] args) {

        divide(15,4);





    }

    public static void divide (int num1,int num2){
        if (num2==0){
            System.out.println("num2 shouldnt be 0");
            return ;

        }
        int result=0;
        while (num1>=num2){
            num1-=num2;
            result++;

        }
        System.out.println(result);



    }
}
