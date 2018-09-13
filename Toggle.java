import java.util.*;
class Toggle
{

    public static void main(String[] args)
    {
        System.out.println("Enter: "); 
        Scanner input = new Scanner(System.in); 
        String str = input.nextLine();
        System.out.println("Converted String:" + toggleString(str)); 
        input.close(); 
     }

    public static String toggleString(String str)
    {
       String toggled = ""; 
       for(int i=0; i<str.length(); i++)
       {


           char letter = str.charAt(i); 

           if(Character.isUpperCase(str.charAt(i)))
           {
                letter = Character.toLowerCase(letter); 
                toggled = toggled + letter; 

           }
           else if(Character.isLowerCase(str.charAt(i)))
           {
               letter = Character.toUpperCase(letter);
               toggled = toggled + letter; 
           }

       }
       return toggled; 

   }
}