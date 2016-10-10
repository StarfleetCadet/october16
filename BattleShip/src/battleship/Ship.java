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
public class Ship 
{
    int length;
    int x;
    int y;
    boolean vertical;
    
    public boolean checkHit(int x, int y)
    {
        boolean hit = false;
        if (y != this.y) return false;
        
        int bow = this.x;
        int back = this.x + this.length;
        
        if (x >= bow && x < back)
        {
            return true;
        }
        return hit;
    }
    
}
