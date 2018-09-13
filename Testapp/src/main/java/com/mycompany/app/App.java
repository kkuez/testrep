
package com.mycompany.app;
import java.util.Scanner;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
	

        System.out.println( "Nachricht eingeben:" );
	Scanner ein= new Scanner(System.in);
	String einstr= ein.next();
	System.out.println("Nachricht: "+einstr);
    }
}
