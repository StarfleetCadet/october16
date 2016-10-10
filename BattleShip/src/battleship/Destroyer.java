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
    public Destroyer(int x, int y, boolean vertical)
    {
        length = 4;
        this.x = x;
        this.y = y;
        this.vertical = vertical;
        
    }
    
}
