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
    String playerName = "Angry Trump";
    int maxX = 15;
    int maxY = 15;
    
    Boolean[][] field1hit = new Boolean[maxX][maxY];
    Boolean[][] field2hit = new Boolean[maxX][maxY];
    
    public List<Ship> ships = new ArrayList<Ship>();
    
    public static String[] alphabet = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O"};
    
    public boolean shot(int x, int y)
    {
        boolean hits = false;
        for(Ship currentShip : ships)
        {
            hits = currentShip.checkHit(x, y);
            
            // Remove ship from field if it is destroyed
            if (currentShip.stillSwimming == false)
            {
                ships.remove(currentShip);
            }
            
            if (hits) {
                break;
            }
        
        }
            
        field1hit[x][y] = hits;
        
        return hits;
    }
    
    public void fireShot()
    {
        System.out.println(playerName + ", it's your turn!");
        String xLetter = Tastatur.Eingabe.readLine("X-Koordinate: ");
        String yLetter = Tastatur.Eingabe.readLine("Y-Koordinate: ");
        
        int x = getIntFromStrCoord(xLetter);
        int y = getIntFromStrCoord(yLetter);
        shot(x, y);        
        drawField();
    }
    
    public static int getIntFromStrCoord(String coord)
    {
        int val = 0;
        
        for (int i = 0; i < alphabet.length; i++)
        {
            if (alphabet[i].equals(coord)) {
                return i;
            }
        }
        
        return val;
    }
    
    
    public void drawField()
    {
        for(int i = -1; i<maxY; i++)
        {
            if (i == -1)
            {
                System.out.print("  A B C D E F G H I J K L M N O\n");                
                System.out.print("|  A B C D E F G H I J K L M N O\n");
                continue;
            }
            
            // Print columns of field 1
            for(int j = -1; j<maxX; j++)
            {                   
                if(j == -1)
                {
                    System.out.print(alphabet[i]+" ");
                    continue;
                }
            
                if (field1hit[j][i] == null)
                {
                    System.out.print("~ ");
                }
                else if (field1hit[j][i] == true)
                {
                    System.out.print("x ");
                }
                else
                {
                    System.out.print("o ");
                }
            }
            
            System.out.println(" | ");
            
            // Print columns of field 2
            for(int j = -1; j<maxX; j++)
            {                   
                if(j == -1)
                {
                    System.out.print(alphabet[i]+" ");
                    continue;
                }
            
                if (field2hit[j][i] == null)
                {
                    System.out.print("~ ");
                }
                else if (field2hit[j][i] == true)
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
    
    public void clearScreen() {
        
        String newLine = "";
        
        for (int i = 0; i < 50; i++) 
        {
            newLine += "\n";
        }
        
        System.out.println(newLine);
    }
    
}
