public class Splitwise {
    void display()
    {
        System.out.println("Welcome to Splitwise!!");
    }
    public static void main(String[] args){
        Splitwise obj=new Splitwise();
        obj.display();
        public static void main(String args[]){
            System.out.println("===Splitwise Console Backend===");
            System.out.println(" ");
            final String expenseDescription="Dinner";
            final double totalAmount=1200.0;
            final int number_of_people=4;
            double individualShare;
            individualShare=totalAmount/number_of_people;
            System.out.println("Expense Description:"+expenseDescription);
            System.out.println("Total amount:"+totalAmount);
            System.out.println("Number of people:"+number_of_people);
            System.out.println("Each Person should pay:"+individualShare);
            System.out.println(" ");
            System.out.println("Feature status:Basic calculation completed.");
        }
    }