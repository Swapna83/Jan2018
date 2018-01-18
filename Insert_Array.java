package handlingArray;

import java.util.Scanner;

public class Insert_Array
{

    public static void main(String[] args)
    {
        int length, pos, value;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the no. of elements you want in array : ");
        length = in.nextInt();
        int[] array = new int[length + 1];
        System.out.println("Enter the array elements : ");
        for (int i = 0; i < length; i++) {
            array[i] = in.nextInt();
        }
        System.out.println("Enter the position to insert the new element : ");
        pos = in.nextInt();
        System.out.println("Enter the value to insert in an array : ");
        value = in.nextInt();
        for (int i = length - 1; i >= pos-1; i--) {
            array[i + 1] = array[i];
        }
        array[pos-1] = value;
        System.out.println("Array after inserting new element : ");
        for(int i=0;i<array.length;i++)
            System.out.print(array[i]+" ");

    }

}
