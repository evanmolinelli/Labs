/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangle;

/**
 *
 * @author cistudent
 */
public class TriangleTest {
    
    public static void main(String[] args) {
        // TODO code application logic here
        int a, b, c;
        System.out.println("The triangle dimensions are 3, 4, and 5 for the first test.");
        Triangle tri = new Triangle(3,4,5);
        System.out.println("The triangle is classified as a: " + tri.classify()+"\n");
     
        System.out.println("The triangle dimensions are 10, 14, and 10 for the second test.");
        Triangle tri2 = new Triangle(10,14,10);
        System.out.println("The triangle is classified as a: " + tri2.classify()+"\n");
        
        System.out.println("The triangle dimensions are 55, 55, and 55 for the third test.");
        Triangle tri3 = new Triangle(55,55,55);
        System.out.println("The triangle is classified as a: " + tri3.classify()+"\n");
    }
    
}
