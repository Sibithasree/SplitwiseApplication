import java.util.Scanner;
public class Splitwise {
    public static void main(String args[]){
        System.out.println("===Splitwise Console Backend===");
        System.out.println(" ");
        final String expenseDescription="Dinner";
        final double totalAmount=1200.0;
        final int number_of_people=4;
        public static void main(String args[]) {
            final String expenseDescription = "Dinner";
            final double totalAmount = 1200.0;
            final int number_of_people = 4;
            double individualShare;
            individualShare=totalAmount/number_of_people;
            System.out.println("Expense Description:"+expenseDescription);
            System.out.println("Total amount:"+totalAmount);
            System.out.println("Number of people:"+number_of_people);
            System.out.println("Each Person should pay:"+individualShare);
            System.out.println(" ");
            System.out.println("Feature status:Basic calculation completed.");
            individualShare = totalAmount / number_of_people;
            final int MENU_ADD_EXPENSE =1;
            final int MENU_VIEW_EXPENSE =2;
            final int MENU_EXIT =3;
            Scanner scanner = new Scanner(System.in);
            boolean running = true;
            while (running) {
                System.out.println("===Splitwise Cinsole Backend===");
                System.out.println();
                System.out.println("1. Add Expense");
                System.out.println("2. View Expense");
                System.out.println("3. Exit");
                System.out.print("Enter choice:");
                int choice;
                choice=scanner.nextInt();
                System.out.println();
                switch(choice){
                    case MENU_ADD_EXPENSE->{
                        System.out.println("Recording Expense(Sample data)...");
                        System.out.println("Expense Saved:"+expenseDescription+"|amount="+totalAmount +"|people="+number_of_people);
                        System.out.println();
                    }
                    case MENU_VIEW_EXPENSE->{
                        System.out.println("---Expense summary---");
                        System.out.println("Description:"+expenseDescription);
                        System.out.println("Total Amount:"+totalAmount);
                        System.out.println("Number of People:"+number_of_people);
                        System.out.println("Individual Share:"+individualShare);
                        System.out.println();
                    }
                    case MENU_EXIT->{
                        running=false;
                    }
                    default ->{
                        System.out.println("Invalid choice.Please enter 1 , 2 , 3.");
                        System.out.println();
                    }
                }

            }
            System.out.println("GoodBye! Thank You for using Splitwise Console Backend.");
            scanner.close();
        }
    }