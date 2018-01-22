public class Second_Smallest
{

    public static void main(String[] args)
    {
        int array1[]=new int[]{1,12,9,4,5,10};
        int len = array1.length;
        
       System.out.println("Elements in array : ");
           for(int i=0;i<len;i++)
               System.out.println(array1[i]);
      
            int small = array1[0];
            int small2 = array1[0];
            for( int i = 0; i<len; ++i)
            {
                if(array1[i]<small)
                    small = array1[i];
                if( array1[i] < small2 && array1[i] > small)
                    small2 = array1[i];
            }
            System.out.println("smallest Element in an array : " + small);
         
            
            System.out.println("second smallest Element in an array : " + small2);
        }



    }


