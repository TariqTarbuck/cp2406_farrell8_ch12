// This class determines the logarithm of a number
public class DebugTwelve1
{
  public static void main(String[] args) throws ArithmeticException
  {
     double num = -8.8, result;
      if(num <= 0)
         throw(new ArithmeticException());
      result = Math.log(num);
      System.out.println("Result is " + result);
  }
}