
/**
 * The purpose of this class is to keep track of
 * and add varrying amounts of miles, yards and feet
 * entered in by day intevals
 *
 * @author Anthony Gonzalez
 * @version January 20, 2019
 */
public class Distance 
{
    public static final int YARDS_IN_MILE = 1760;
    public static final int FEET_IN_YARD = 3;
    private int miles;
    private int yards;
    private int feet;
    public Distance (int miles, int yards, int feet)
    {
        assert (miles >=0 && yards >=0 && yards < YARDS_IN_MILE && feet >=0 && feet < FEET_IN_YARD);
        this.miles=miles;
        this.yards=yards;
        this.feet=feet;
    }
    
    public static boolean isValidDistance (int miles, int yards, int feet)
    {
       if (miles >= 0 && yards >=0 && yards < YARDS_IN_MILE && feet >=0 && feet < FEET_IN_YARD)
        return true;
        else 
        return false;
    }
    
    public Distance addDistance ( Distance newDistance)
    {
        int totalMiles, totalYards, totalFeet;
        totalMiles = newDistance.getMiles() + this.miles;
        totalYards = newDistance.getYards() + this.yards;
        totalFeet = newDistance.getFeet() + this.feet;
        if (totalFeet >= FEET_IN_YARD)
        {
            totalFeet = totalFeet - FEET_IN_YARD;
            totalYards = totalYards +1;
        }
        if (totalYards >= YARDS_IN_MILE)
        {
            totalYards = totalYards - YARDS_IN_MILE;
            totalMiles = totalMiles + 1;
        }
        return new Distance (totalMiles, totalYards, totalFeet);
    }
    
    public int getMiles()
    {
         return miles;
    }
    
    public int getYards ()
    {
        return yards;
    }
    
    public int  getFeet ()
    {
        return feet;
    }
  
    public String toString ()
    {
        String result = miles + "m: " + yards + "y: " + feet + "f ";
        return result;
    }
    
}
