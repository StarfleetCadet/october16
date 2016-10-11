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
public class BattleShip {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Field player1Field = new Field();
        Field player2Field = new Field();
     
        player1Field.playerName = Tastatur.Eingabe.readLine("Player 1, enter your name: ");
        player2Field.playerName = Tastatur.Eingabe.readLine("Player 2, enter your name: ");
        
        System.out.println(player1Field.playerName + " position your Boats");
        player2Field.ships.add(InflatableBoat.getFromUser());
        player2Field.ships.add(Destroyer.getFromUser());
        player2Field.ships.add(BattleCruiser.getFromUser());
        player2Field.ships.add(AircraftCarrier.getFromUser());
        
        
        System.out.println(player2Field.playerName + " position your Boats!");
        player1Field.ships.add(InflatableBoat.getFromUser());
        player1Field.ships.add(Destroyer.getFromUser());
        player1Field.ships.add(BattleCruiser.getFromUser());
        player1Field.ships.add(AircraftCarrier.getFromUser());
        
        while (player1Field.ships.isEmpty() == false && player2Field.ships.isEmpty() == false)
        {
            player1Field.getCoordsFromUser();
            player2Field.getCoordsFromUser();
        }
        
        if (player1Field.ships.isEmpty()) 
        {
            System.out.println("*** "+player1Field.playerName+" WINS THIS BATTLE! ***");
        } else {
            System.out.println("*** "+player2Field.playerName+" WINS THIS BATTLE! ***");
        }

    }

}
