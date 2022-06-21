package at.fhj.msd;

public class Main {
    public static void main(String[] args) {
        StringQueue q1 = new StringQueue(5);
        String obj = "one";
        String obj2 = "two";
        String obj3 = "three";
        String obj4 = "four";
        String obj5 = "five";
        String obj6 = "six";

        System.out.println("Offer #1: " + obj + " " + q1.offer(obj));
        System.out.println("Offer #2: " + obj2 + " " + q1.offer(obj));
        System.out.println("Offer #3: " + obj3 + " " + q1.offer(obj));
        System.out.println("Offer #4: " + obj4 + " " + q1.offer(obj));
        System.out.println("Offer #5: " + obj5 + " " + q1.offer(obj));
        System.out.println("Offer #6: " + obj6 + " " + q1.offer(obj));



    }

}
