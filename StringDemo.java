import java.util.Arrays;
public class StringDemo
{
    public static void main(String args[])
    {
        String a = args[0];
        String b= args[1];
        String newStr1[]= a.split("\\s");
        int intArray1[] = new int[newStr1.length];
        for(int i=0 ; i<newStr1.length;i++)
             intArray1[i] = Integer.parseInt(newStr1[i]);
        
        String newStr2[]= b.split("\\s");
        int intArray2[] = new int[newStr2.length];
        for(int i=0 ; i<newStr2.length;i++)
            intArray2[i] = Integer.parseInt(newStr2[i]);
        
        if(intArray1.length == intArray2.length)
        {
            int newArray[] = new int[intArray1.length];
            for(int i=0 ; i<newArray.length ; i++)
                newArray[i] = intArray1[i] + intArray2[i];
            
            System.out.println("New String after addition : ");
            String newStringArray[] = new String[newArray.length];
            for(int i=0; i<newArray.length; i++)
                newStringArray[i] = String.valueOf(newArray[i]);
            System.out.println(Arrays.toString( newStringArray));
        }
    }
}
