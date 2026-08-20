public static void main(String args[])

{
    double value=9.7;
    int num=(int)value;
    int round=(int)Math.round(value);
    System.out.println("Integer value:"+num);
    System.out.println("Rounded value:"+round);
    int value1=5;
    int value2=2;
    int result=5/2;//dividing both numbers and storing result as integer
    double res=5/2;//dividing both numbers and storing result as double
    System.out.println("Result when stored as Integer:"+result);
    System.out.println("Result when stored as double:"+res);
}
}