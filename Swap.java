//program on swapping of two numbers without third variable
import java.io.*;
  class Swap
{
public static void main(String ar[])
{
int a=5,b=9;
a=a+b;
b=a-b;
a=a-b;
System.out.println("After swapping----->" +a+b);
}
}
//output
//After swapping----->9 5
