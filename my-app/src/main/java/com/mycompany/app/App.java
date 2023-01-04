package com.mycompany.app;
import processing.core.PApplet;
/**
 * Hello world!
 *
 */
public class App extends PApplet{

    public void settings(){
		size(500, 500);
	}
	
	public void draw(){
		ellipse(mouseX, mouseY, 50, 50);
	}
	
	public void mousePressed(){
		background(64);
	}

    public static void main( String[] args )
    {
        String[] processingArgs = {"MySketch"};
		App mySketch = new App();
		PApplet.runSketch(processingArgs, mySketch);
    }
}

