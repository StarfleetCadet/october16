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
public class InflatableBoat extends Ship
{
    public InflatableBoat (int x, int y, boolean vertical)
    {
        length = 2;
        this.x = x;
        this.y = y;
        this.vertical = vertical;
    }
    
    
}
