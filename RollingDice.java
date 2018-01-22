public class RollingDice
{
    public static final int num=100;
    public static void main(String[] args)
    {
        int d1 = 0, d2 = 0 , d3 = 0 , d4 =0 , d5 =0 , d6 = 0;
        for(int i = 0; i < num; i++)
        {
        int roll = (int)(6.0 * Math.random() + 1.0);
            switch(roll)
            {
                case 1 : d1++;
                         System.out.println("1 :" + d1);
                         break;
                case 2 : d2++;
                         System.out.println("2 :" + d2);
                         break;
                case 3 : d3++;
                         System.out.println("3 :" + d3);
                         break;
                case 4 : d4++;
                         System.out.println("4 :" + d4);
                         break;
                case 5 : d5++;
                         System.out.println("5 :" + d5);
                         break;
                case 6 : d6++;
                         System.out.println("6 :" + d6);
                         break;
                 
                default : System.out.println("Wrong case");         
            }
        }
    }

}
