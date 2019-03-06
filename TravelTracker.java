/*
 *  This program tracks total distance in miles,
 *  yards and feet covered in a trip. Invalid values
 *  lead to error messages
 *  
 *  @author (Anthony Gonzalez)
 *  @Version January 20th, 2019
 */
import java.util.*;
public class TravelTracker 
{   
 public static void main (String [] args)
 {
     Distance totalDistance;
     int miles,yards,feet;
     Scanner input = new Scanner (System.in);
     
     System.out.println ("This program tracks total distance in miles,");
     System.out.println ("yards and feet covered in a trip. Invalid values");
     System.out.println ("lead to error messages");
     System.out.println ("");
     System.out.println ("Author: Anthony Gonzalez \tVersion: January 20,2019");
     
     System.out.println ("");
     System.out.println ("Enter distance in miles, yards and feet, all in a");
     System.out.println ("single line with spaces in between. Entering all");
     System.out.println ("zeroes will terminate the program.");
     System.out.println ("");
     
     totalDistance = new Distance (0,0,0);
     System.out.println ("Distance covered so far is: "+ totalDistance.toString());
     System.out.println("");
     
     System.out.print ("Enter distance covered for a day: ");
     miles = input.nextInt();;
     yards = input.nextInt();
     feet = input.nextInt();
     
     

     while (miles !=0 || yards  !=0 || feet !=0)
     {
        if (Distance.isValidDistance (miles,yards,feet))
         {         
         Distance distance1 = new Distance (miles,yards,feet);
         totalDistance = totalDistance.addDistance(distance1);
         
         System.out.println ("Distance covered so far is: " + totalDistance.toString());
         System.out.println ();
         
         System.out.print ("Enter distance covered for a day: ");
         miles = input.nextInt();
         yards = input.nextInt();
         feet = input.nextInt();
        }
        else 
        {
            System.out.println ("**Invalid Value. Not processed.");
            System.out.println ("");
            System.out.print ("Enter distance covered for a day: ");
            miles = input.nextInt();
            yards = input.nextInt();
            feet = input.nextInt();
            
        }
     }
     if (miles ==0 && yards ==0 && feet ==0)
     {
         System.out.println ();
         System.out.println ("Total distance covered in this trip is : " + totalDistance);
         System.out.println ();
         System.out.println ("Program has terminated");
     }
    }
 }   
