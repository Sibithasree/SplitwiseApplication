import java.awt.*;

class LabExcercise{
    public static void main(String args[]){
        int quotient_in_integer=17/5;
        System.out.println("Result of two integer division:"+quotient_in_integer);
        double quotient_in_double=17.0/5;
        System.out.println("Result of a double value with a integer value:"+quotient_in_double);
        int modulus=17%5;
        System.out.println("Modulus Result:"+modulus);
        int choice=2;
        System.out.println(choice==2);
        System.out.println(choice!=3);
        System.out.println(choice>=1&&choice<=3);

    }
}