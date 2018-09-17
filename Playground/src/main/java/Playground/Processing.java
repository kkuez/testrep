package Playground;

import processing.core.PApplet;
import processing.opengl.*;

public class Processing extends PApplet {

    public void settings() {

        size(450, 320);

    }

    public void starten(){
        String[] processingArgs = {"MySketch"};
        Processing mySketch = new Processing();


        PApplet.runSketch(processingArgs, mySketch);


    }
    public void draw(){


       kreis(60,60,80,80,0,100,0);

        kreis(95,120,80,80,0,100,0);

        kreis(160,130,80,80,0,100,0);

        kreis(220,120,80,80,0,100,0);

        kreis(280,130,80,80,0,100,0);

        kreis(340,120,80,80,0,100,0);
    }


    public void rechteck(){
        //Rechteck
        fill(255,0,00,10);
        rect(10,10,100,300);
    }
    public void kreis(int posx, int posy, int breit, int hoch, int farbe1, int farbe2, int farbe3){
        stroke(0);
        strokeWeight(2);

        fill(farbe1,farbe2,farbe3);
        ellipse(posx, posy, breit, hoch);
    }
    public void linie(){

        stroke(0,0,255,10);
        strokeWeight(10);
        fill(0,0,255);
        line(310,10,310,300);
        noStroke();
    }
    public void dreieck(){
        fill(255,255,0);
        triangle(400,10,370,310,440,310);

    }
}
