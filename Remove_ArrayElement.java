package handlingArray;
import java.util.Scanner;
public class Remove_ArrayElement
{
    public static void removeElement(int[]array,int val)
    {
        int location = 0 , flag = 0;
        for(int i = 0; i<array.length;i++)
        {
            if(array[i]==val)
            {
                flag = 1;
                location = i;
                break;
            }
            else
                flag = 0;
        }
        if( flag == 1 )
        {
            for(int i = location+1;i<array.length;i++)
            {
                array[i-1] = array[i];
            }
        }
        else
            System.out.println("Element not found");
        System.out.println("After removing element from array : ");
        for(int i = 0; i<array.length - 2; i++)
        {
            System.out.println(array[i]);
        }
        System.out.println(array[array.length-2]);
    }
    
    public static void main(String[] args)
    {
       int length, value ;
       System.out.println("Enter the no. of elements you want in array : ");
       Scanner in = new Scanner(System.in);
       length = in.nextInt();
       int[] array = new int[length];
       System.out.println("Enter the array elements : ");
       for (int i = 0; i < length; i++)
       {
           array[i] = in.nextInt();
       }
      
       System.out.println("Enter the value to remove from an array : ");
       value = in.nextInt();
       removeElement(array,value);
    }

}
