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
        InflatableBoat trump = new InflatableBoat(0, 0, false);
        AircraftCarrier nimitz = new AircraftCarrier(0, 2, false);
        Destroyer bainbridge = new Destroyer(1, 5, false);
        BattleCruiser alaska = new BattleCruiser(5, 5, false);

        Field myField = new Field();
        myField.ships.add(trump);
        myField.ships.add(nimitz);
        myField.ships.add(alaska);
        myField.ships.add(bainbridge);

        myField.shot(2, 2);

    }

}
