
public class MyClass {
    public static void main(String args[]) {
      try{
          int k=3; // to execute, change the value of k
          int a = 1/k; // an exception is thrown here
          System.out.println("Output: "+a);
      }catch(ArithmeticException ae){ // which is caught here
          System.out.println("Oops, division by zero is not allowed!!");
      }
    }
}


public class MyClass {
    public static void main(String args[]) {
      try{
          int[] list = null; // to execute, change the value of k
          int a = list[0]; // an exception is thrown here
          System.out.println("Output: "+a);
      }catch(ArithmeticException | NullPointerException e){ // which is caught here
          System.out.println("The error is [--> "+e+" <--]");
      }
    }
}

