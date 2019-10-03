
package whats.the.area;

/**
 *
 * Name:Peter Aller
 * Project Name: Whats the area
 * Period: 7
 *  
 */

// Import Scanner
import java.util.Scanner; 

public class WhatsTheArea {

//    Create Scanner object HERE so you may use the scanner 
//    throughout all methods
    private static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args){
    
    int surfaceArea = 0;
    surfaceArea += triangle();
    surfaceArea += triangle();
    surfaceArea += square();
    surfaceArea += circles();
    surfaceArea += circles();
    surfaceArea += circles();
    surfaceArea += circle();
    //TODO: add calls to other methods for cach of the shapes needed
    System.out.println("\nThe total area of Michael's truck is : " + surfaceArea);
    } 
    
    public static int triangle(){
    System.out.println("\nThe area of a triangle is: 1/2 * base * height");
    System.out.print("base = ");
    int base = in.nextInt();
    System.out.print("height = ");
    int height = in.nextInt();
    int area = (int)(0.5 * (base * height));
    System.out.println("The area of this shape is: " + area);
    return area; 
    }
    
    
    public static int square(){
    System.out.println("\n The area of a square is : base * height");
    System.out.print("base = ");
    int base2 = in.nextInt();
    System.out.print("height = ");
    int height2 = in.nextInt();
    int area2 = (int)(base2 * height2);  
    System.out.println("The area of this shape is: " + area2);
    return area2;
    }
    
    public static int circle(){
    System.out.println("\n The area of a circle is : Pi * r^2");
    System.out.println("radius = ");
    int radius = in.nextInt();
    System.out.println("Pi = ");
    int Pi = in.nextInt(); 
    
            
            
        
        
    }
    
        
        
        
        
        
        
        
        
        
     
    
    
    
  
        
        
        
        
        
     
    
       
        
    
    

