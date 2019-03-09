// **********************************************************************
// Programmer:	McFadden
// Class:	CS40S
//
// Assignment:	A4
//
// Description:	This program will read int size array and non passable addresses
//              then will print map and number of passes
//
//
// Input:	The input will come from a fill, first line dimensions, second
//              line will be number of non passable addresses n, next n line
//              are the addresses
//
//  Output:	will print out string map of labyrinth then the number of paths
// ***********************************************************************

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.*;
import java.text.DecimalFormat;

public class Main
{  // begin class
	public static void main(String args[]) throws IOException
	{  // begin main
	// ***** declaration of constants *****
	
	// ***** declaration of variables *****
	
            boolean error = false;
            String strin; //variable for input
            String[] tokens; //variable for seperated input
            String delim = "[ ]+"; //variable for seperating
            
            int rows, columns;
            int[][] blocks;
            
	// ***** create objects *****
		
            Labyrinth lab = null;
            BufferedReader in = null;
        
	// ***** create input stream *****
	
		try{
                    in = new BufferedReader(new FileReader("labyrinthData.txt"));
                }
		catch(FileNotFoundException e){
                    System.out.println("File Not Found ERROR");
                    error = true;
                }
                
	// ***** Print Banner *****
	
		System.out.println("**********************************");
		System.out.println("NAME:        Shae McFadden");
		System.out.println("Class:       CS40S");
		System.out.println("Assignment:  A4");
		System.out.println("**********************************");
		
	// ***** main body *****
	
            if(!error){
                strin = in.readLine();
                while(strin != null){
                    tokens = strin.split(delim);
                    rows = Integer.parseInt(tokens[0]);
                    columns = Integer.parseInt(tokens[1]);
                    
                    blocks = new int[Integer.parseInt(in.readLine())][2];
                    
                    for(int i = 0; i <blocks.length; i++){
                        strin = in.readLine();
                        tokens = strin.split(delim);
                        blocks[i][0] = Integer.parseInt(tokens[0]);
                        blocks[i][1] = Integer.parseInt(tokens[1]);
                    }//end of for loop
                    
                    lab = new Labyrinth(rows, columns, blocks);
                    
                    System.out.println("\n" + lab.map + "\n");
                    
                    strin = in.readLine();
                }
            }//end of if no error

	// ***** closing message *****
	
		System.out.println("end of processing");
	
	}  // end main	
}  // end class