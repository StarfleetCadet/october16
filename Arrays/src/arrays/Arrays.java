/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;
import Tastatur.Eingabe;

/**
 *
 * @author aviva
 */
public class Arrays 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
//         int[] zahlen = new int[10];
//        
//        for( int i = 0; i < zahlen.length; i++)
//        {
//            zahlen[i] = (i+1) * (i+1);
//           
//        }
//                 
//        for(int i = zahlen.length -1; i>= 0; i--)
//        {
//            System.out.println(zahlen[i] + " ");
//        }
    //---------------------------------------------------------------------------------------------------------
//        int anzahl = Eingabe.readInteger("Feldgröße: ");
//        int[] zahlen = new int[anzahl];
//        
//        for (int i = 0; i < zahlen.length; i++)
//        {
//            zahlen[i] = (int)(Math.random() * 100 + 1);
//        }
//       
//        for (int i = 0; i < zahlen.length; i++)
//        {
//            System.out.println(zahlen[i] + " ");
//        }
//        System.out.println("");
//        
//        int maxZahl = zahlen[0];
//        for (int i = 1; i < zahlen.length; i++)
//        {
//            if (maxZahl < zahlen[i] )
//                maxZahl = zahlen[i];
//        }
//        System.out.println("Größte Zahl: " + maxZahl);
//        
//        int minZahl = zahlen[0];
//        for (int i = 1; i < zahlen.length; i++)
//        {
//            if (minZahl > zahlen[i] )
//                minZahl = zahlen[i];
//        }
//        System.out.println("Kleinste Zahl: " + minZahl);
    //------------------------------------------------------------------------------------------------------------------------
//        
//        int[] zahlen = {77, 5, 13, 9, 63, 2};
//        
//        System.out.println("Vor der Rotation: ");
//        for (int i = 0; i < zahlen.length; i++ )
//        {
//            System.out.println(" " + zahlen[i]);
//        }
//        //Rotieren
//        int tmp = zahlen[zahlen.length -1];
//        for( int i = zahlen.length -1; i > 0; i--)
//        {
//            zahlen[i] = zahlen[i-1];
//        }
//        zahlen[0] = tmp;
//                    
//        System.out.println("\nNach der Rotation:");
//        for(int i = 0; i < zahlen.length; i++)
//        {
//            System.out.println(" " + zahlen[i]);
//        }
//        System.out.println("");
    //-------------------------------------------------------------------------------------------------------------------
    //Datum prüfen
//        int[] tageImMonat = {31,28,31,30,31,30,31,31,30,31,30,31};
//        String[] strMonat = {"Januar","Februar","März","April","Mai","Juni",
//                             "Juli","August","September","Oktober","November","Dezember"};
//        
//        int tag   = Eingabe.readInteger("  Tag: ");
//        int monat = Eingabe.readInteger("Monat: ");
//        int jahr  = Eingabe.readInteger(" Jahr: ");
//        boolean eingabeOK = true;
//        
//        if(jahr < 0)
//            eingabeOK = false;
//        if(monat < 1 || monat > 12)
//        {
//            eingabeOK = false;
//        }
//        else    //Schaltjahr-Korrektur
//        {
//            if(jahr % 4 == 0 && jahr % 100 != 0 || jahr % 400 == 0)
//               tageImMonat[1] = 29;
//            if(tag < 1 || tag > tageImMonat[monat-1])
//                eingabeOK = false;
//        }
//        int tagesZahl = 0;
//        if(eingabeOK)
//        {
//            for(int i = 0; i < monat -1; i++)
//                tagesZahl += tageImMonat[i];
//        }
//        tagesZahl += tag;
//        
//        if(eingabeOK)
//        {
//            System.out.println(tag + "." + strMonat[monat-1] + "" + jahr
//                                + " ist der " + tagesZahl + ". Tag im Jahr.");
//        }
//        else
//        {
//            System.out.println(tag + "." + monat + "." + jahr + "ist KEIN gültiges Datum!");
//        }
////-------------------------------------------------------------------------------------------------------------------
//        int[] zahlen = new int [20];
//        for(int i = 0; i < zahlen.length; i++)

//        {
//            zahlen[i] = (int) (Math.random() * 56 + 5);
//            System.out.println(zahlen[i] + " ");
//        }
//        int zahl = Eingabe.readInteger("\nWelche Zahl soll gesucht werden? ");
//        boolean gefunden = false;
//        int i;
//       
//        for(i = 0; i < zahlen.length; i++)
//        {
//            if(zahl == zahlen[i])
//            {
//                gefunden = true;
//                break;
//            }
//        }
//        if(gefunden)
//            System.out.println("Die Zahl " + zahl + " steht an " + (i+1) + ".Stelle. ");
//        else
//            System.out.println("Die Zahl " + zahl + " wurde nichr gefunden! ");
//---------------------------------------------------------------------------------------------------------------------------        
        //bubblesort
        
//        int[] zahlen = new int[20];
//        for(int i = 0; i < zahlen.length; i++)
//        {
//            zahlen[i] = (int)(Math.random()* 100 + 1)* 2;
//            System.out.println(zahlen[i] + " ");
//        }
//        System.out.println("");
//        
//        for (int n = zahlen.length; n > 1; n--)
//        {
//            boolean hasteWasVertauscht = false;
//            
//            for (int i = 0; i<n; i++)
//            {
//                hasteWasVertauscht = false;
//                
//                if (zahlen[i] > zahlen[i+1])
//                {
//                    int tmp = zahlen[i];
//                    zahlen[i] = zahlen[i+1];
//                    zahlen[i+1] = tmp;
//                    
//                    hasteWasVertauscht = true;
//                }
//            }
//            
//            if (hasteWasVertauscht == false) 
//            {
//                break;
//            }
//        }
//        for (int i = 0; i < zahlen.length; i++)
//        {
//            System.out.println(zahlen[i] + " ");
//        }
//            
//               
//                
//        
        
    }
    
}
