/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aviva
 */
public class Ship 
{
    //geht hier zu erst rein
    public static String shipClass = "";
    int length;
    int x;
    int y;
    boolean vertical;
    
    boolean stillSwimming = true;
    
    List<int[]> positions = new ArrayList<int[]>();
    
    /**
     * Fills list of positions with pairs of coordinates
     */
    protected void createPositions()
    {
        if (vertical)
        {
            for (int i = 0; i < length; i++)
            {
                int[] coords = {this.x, this.y + i};        
                positions.add(coords);
            }
        } 
        else 
        {
            for (int i = 0; i < length; i++)
            {
                int[] coords = {this.x + i, this.y};        
                positions.add(coords);
            }            
        }
        
        
        
    }
    
     
    public boolean checkHit(int x, int y)
    {
        boolean hit = false;

        // Check lists of positions, one at a time
        for (int[] coords : positions) 
        {
            
            if (coords[0] == x && coords[1] == y) {
                hit = true;
                positions.remove(coords);
                break;
            }
        }
        
        if (positions.isEmpty())
        {
            stillSwimming = false;
            System.out.println("Hurray! You just destroyed a "); //+ shipClass);
        }
        
        return hit;
    }
    
}
