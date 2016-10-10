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
    int length;
    int x;
    int y;
    boolean vertical;
    
    List<int[]> positions = new ArrayList<int[]>();
    
    /**
     * Fills list of positions with pairs of coordinates
     */
    protected void createPositions()
    {
        // First coordinates are our ships position
        int[] coords = {this.x, this.y};        
        positions.add(coords);
        
        if (vertical)
        {
            
        } 
        else 
        {
            
        }
        
        
        
    }
    
    
    
    public boolean checkHit(int x, int y)
    {
        boolean hit = false;
        
        // Ship in vertical position?
        if (vertical) 
        {
            // X-Wert vom Schuss liegt neben x-Wert vom vertikal liegenden Schiff: Nicht getroffen
            if (x != this.x) return false;
            
            // Schuss liegt auf einer Linie mit dem Schiff. Liegt er auch zwischen Bug und Heck?
            int yBow = this.y;
            int yBack = yBow + this.length;
            
            if (y >= yBow && y < yBack)
            {
                // Schiff wurde zwischen Bug und Heck getroffen.
                return true;
            }
            
            
        } 
        else 
        {
            // Schiff liegt horizontal. D. h. wenn Y-Wert vom Schuss nicht dem Y-Wert vom Schiff entspricht,
            // kann das Schiff nicht getroffen worden sein.
            if (y != this.y) return false;

            int xbow = this.x;
            int xback = this.x + this.length;

            if (x >= xbow && x < xback)
            {
                return true;
            }            
        }
        return hit;
    }
    
}
