/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship;

/**
 *
 * @author aviva
 */
public class Destroyer extends Ship 
{
    
    public static String shipClass = "Destroyer";

    public Destroyer(int x, int y, boolean vertical, String shipClass) 
    {
        length = 4;
        this.x = x;
        this.y = y;
        this.vertical = vertical;
        createPositions();

    }
    
    
    public static Destroyer getFromUser() 
    {
        System.out.println("Create your "+shipClass);
        String xPos = Tastatur.Eingabe.readLine("x: ");
        int x = Field.getIntFromStrCoord(xPos);
        String yPos = Tastatur.Eingabe.readLine("y: ");
        int y = Field.getIntFromStrCoord(yPos);
        
        boolean vertical = false;
        String direction = Tastatur.Eingabe.readLine("vertical (v) or horizontal (h)? ");
        
        if (direction.equals("v"))
        {
            vertical = true;
        }
        
        return new Destroyer(x, y, vertical, shipClass);
        
    }

}
