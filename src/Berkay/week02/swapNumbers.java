package Berkay.week02;

public class swapNumbers {
    public static void main(String[] args) {

       int box1=15;
       int box2=20;

        System.out.println("box1 = " + box1);
        System.out.println("box2 = " + box2);
        System.out.println("lets reverse values");

       box2=box1+box2;
       box1=box2-box1;
       box2=box2-box1;

        System.out.println("box1 = " + box1);
        System.out.println("box2 = " + box2);





    }
}
