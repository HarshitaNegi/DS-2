import java.util.*;
class Palindrome
{
   public static void main(String args[])
   {
      String n, reverse = "";
      Scanner s = new Scanner(System.in);
      System.out.println("Enter a string");
      n=s.nextLine();
      int length=n.length();
      for ( int i = length - 1; i >= 0; i-- )
         reverse = reverse + n.charAt(i);
      if (n.equals(reverse))
      {
         System.out.println("True and the reverse is");
         System.out.println(reverse);
      }
      else
         {   
         System.out.println("False and the reverse is");
         System.out.println(reverse);
         }   
   }
}