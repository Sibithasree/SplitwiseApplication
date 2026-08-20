import java.awt.*;
import java.util.Scanner;

class LabExercise{
    public static void main(String args[]){
        int choice=2;
        System.out.println(choice==2);
        System.out.println(choice!=3);
        System.out.println(choice>=1&&choice<=3);

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your choice:");
        int choice= scanner.nextInt();
        if(choice==1){
            System.out.println("Add");
        }
        else if(choice==2)
        {
            System.out.println("View");
        }
        else if(choice==3){
            System.out.println("Exit");
        }
        else{
            System.out.println("Invalid");
        }
    }
}