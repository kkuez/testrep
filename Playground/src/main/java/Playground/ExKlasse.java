package Playground;

import javafx.scene.shape.Ellipse;
import javax.swing.*;
import processing.core.PApplet;

public class ExKlasse{

    public void fenstermachen(String titel, int breite, int höhe)
    {
        JFrame fenster = new JFrame(titel);
        JLabel label = new JLabel(titel);

        label.setSize(breite, höhe);
        fenster.add(label);

        fenster.setSize(breite, höhe);
        fenster.setVisible(true);

        Ellipse kreis = new Ellipse(56,46,55,55);
    }


}