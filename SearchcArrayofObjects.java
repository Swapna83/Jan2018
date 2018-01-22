package handlingArray;

import java.util.Scanner;

class Car
{
    public String color,model;
    public int price;
    Car(String color,int price,String model)
    {
        this.color = color;
        this.price = price;
        this.model = model;
    }
    public static Car[] search_car(String c_name, Car[] carArray)
    {
           Car[] result=new Car[carArray.length];
           System.out.println("Avilable Cars of  " + c_name  + " are : ");
            for(int i =0;i<carArray.length;i++)
            {
                if(carArray[i].color.equalsIgnoreCase(c_name))
                {
                    result[i] = carArray[i]; 
                   // result[i].model = carArray[i].model;
                }     
            }  
            return result;  
    }
}
public class SearchcArrayofObjects
{
    public static void main(String[] args)
    {
        Car[] c = new Car[10];
        Scanner in = new Scanner(System.in);   
        for(int i=0;i<c.length;i++)
        {
            int price = (int)(15000+Math.random()*10000);
            if(i%2 == 0)
              c[i] = new Car("Red",price,"Nissan");
            else
                c[i] = new Car("Blue",price,"Ford");
        }
        
        System.out.println("car array :");
        for(int i= 0; i<c.length;i++ )
        {
            System.out.println(" "+c[i].price);
            System.out.print(" "+c[i].color);
            System.out.print(" "+c[i].model);
        }
        
        System.out.println("\nEnter the color");  
        String color_name = in.nextLine();    
        Car car_res[] = Car.search_car(color_name,c);
        //System.out.println("Avilable cars are : ");
        for(Car c1 : car_res)
        {
            if( c1 != null )
            {
            System.out.println(c1.model);
            System.out.print(c1.price);
            }
        }
        
    }

       
}
