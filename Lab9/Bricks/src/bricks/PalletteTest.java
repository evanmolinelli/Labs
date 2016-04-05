/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bricks;

/**
 *
 * @author cistudent
 */
public class PalletteTest {
    public static void main(String[] args)
    {
        Palette pal = new Palette(15, 8);
        System.out.println("Testing palettes now.");
        System.out.println("Palette1 has height of:" + pal.getHeight());
        System.out.println("Palette1 has weight of:" + pal.getWeight());
        
        Brick brick = new Brick(8, 20,12);
        System.out.println("The surface area:" + brick.getSurfaceArea());
        System.out.println("The volume:" + brick.getVolume());
        System.out.println("The individual brick weight:" + brick.getWeight());
    }
}
