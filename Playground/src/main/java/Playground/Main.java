package Playground;
import processing.core.PApplet;

import javax.swing.*;
import java.awt.*;


public class Main
{
    public static void main( String[] args )
    {
//        ExKlasse Fenster = new ExKlasse();
//        Fenster.fenstermachen("Testfenster", 300, 300);

        Processing proform = new Processing();
   //     proform.settings();
        proform.starten();

        try {
            proform.draw();
        }catch(NullPointerException e){
            System.out.print(e+"\n");

        }



    }
}
