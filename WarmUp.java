public class WarmUp
{
  public static void main(String[] args)
  {
    boolean real = isDivisible(25, 5);
    boolean even = isEven(8);
    System.out.println("isDivisible = " + real + ", isEven = " + even);
  }
  public static boolean isEven(int n)
  {
    return (n % 2 == 0);
  }
  public static boolean isDivisible(int dividend, int divisor)
  {
    return (dividend % divisor == 0);
  }
  
}
