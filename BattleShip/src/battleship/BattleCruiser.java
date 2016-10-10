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
public class BattleCruiser extends Ship
{
    public BattleCruiser(int x, int y, boolean vertical)
    {
        length = 5;
        this.x = x;
        this.y = y;
        this.vertical = vertical;
    }
    
}
