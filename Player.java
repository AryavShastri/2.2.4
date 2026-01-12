/*
 * Activity 2.2.4
 */
import java.util.Scanner;

public class Player
{
 private String name = new String(); 
 private double points;
 
 public String getName()
 {
    return name;
 }
 
 public void setName()
 {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter Player Name:"); 
    String newName = sc.nextLine();
    while (newName.length() > 10)
    {
      System.out.println("Entry too long, Enter Player Name:");
      newName = sc.nextLine();
    }
    
    name = newName;
}
  
 public double getPoints()
 {
   return points;
 }
 
 public void setPoints(int p)
 {
   points = p;
 }
  
} 
