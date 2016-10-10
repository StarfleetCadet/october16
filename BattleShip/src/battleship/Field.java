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
public class Field 
{
    int maxX = 15;
    int maxY = 15;
    Boolean[][] hit = new Boolean[maxX][maxY];
    public List<Ship> ships = new ArrayList<Ship>();
    
    String[] alphabet = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O"};
    
    public boolean shot(int x, int y)
    {
        boolean hits = false;
        for(Ship currentShip : ships)
        {
            hits = currentShip.checkHit(x, y);
        }
        return hits;
    }
    
    public void drawfield()
    
}
