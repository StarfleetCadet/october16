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
    
    public void drawField()
    {
        for(int i = -1; i<maxY; i++)
        {
            if (i == -1)
            {
                System.out.print(" A B C D E F G H I J K L M N O\n");
                continue;
            }
            
            for(int j = -1; j<maxX; j++)
            {                   
                if(j == -1)
                {
                    System.out.print(alphabet[i]+" ");
                    continue;
                }
                
                if (hit[j][i] == null)
                {
                    System.out.print("~ ");
                }
                else if (hit[j][i] == true)
                {
                    System.out.print("x ");
                }
                else
                {
                    System.out.print("o ");
                }
            }
            System.out.print("\n");
        }
    }
    
}
