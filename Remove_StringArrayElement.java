package handlingArray;
import java.util.Arrays;
import java.util.Scanner;
public class Remove_StringArrayElement
{

    public static void main(String[] args)
    {
      int length;
      Scanner in = new Scanner(System.in);
      System.out.println("Enter the no. of string you want in string array : ");
      length = in.nextInt();
      String str_array[] = new String[length + 1];
      System.out.println("Enter the array elements : ");
      for (int i = 0; i <= length; i++)
      {
          str_array[i] = in.nextLine();
      }
      System.out.println("Enter the string to remove from an string array : ");
      String value = in.nextLine();
      for( int i = 0; i<str_array.length; i++ )
      {
          if(str_array[i].equals(value))
          {
              str_array[i] = "null";
              break;
          }
      }
      System.out.println("New String array : ");
      for(int i = 0; i<str_array.length; i++)
          System.out.println(str_array[i]);
    }
}