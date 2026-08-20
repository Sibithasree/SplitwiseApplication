import java.util.Scanner;


class LabExcercise{
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        final int add=1;
        final int view=2;
        final int exit=3;
        System.out.println("enter the choice:");
        int choice=scanner.nextInt();
        switch(choice){
            case add->{
                System.out.println("Add");
            }
            case view-> {

                System.out.println("View");
            }
            case exit-> {


                System.out.println("Exit");
            }
            default->
                    System.out.println("Invalid");
            int num=5;
            for(int i=1;i<=num;i++){
                System.out.println(i);
            }
        }
    }