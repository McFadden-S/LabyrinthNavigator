/* **********************************************************
 * Programmer:  McFadden
 * Class:	CS40S
 * 
 * Assignment:	A4
 *
 * Description:	This class will hold a map of labyrinth, as well as calculate
 *              number of paths
 * 
 * *************************************************************
 */
 
 // import files here as needed
 
 
 public class Labyrinth
 {  // begin class
 	
 	// *********** class constants **********
 	// ********** instance variable **********
 	
        int[][] lab;
        String map;
        int path;
     
 	// ********** constructors ***********
 	
        /*
        Purpose: Constructor for the Labyrinth which will automatically
        calculate basic information
        Input: a 2D array of the blocked addresses
        */
        public Labyrinth(int row, int column, int[][] blocks){
         
            lab = builder(row, column, blocks);
            map = mapMaker(lab);
            //path = pathfinder(lab); 
        }
        
 	// ********** Calculators **********
 	
        /*
        Purpose: method to create the labyrinth array with blocked addresses
        Input: number(int) of rows and columns as well as the blocked addresses (int[][])
        Output: the labyrinth array (int[][])
        */
        private int[][] builder(int row, int column, int[][] block){
            int[][] l = new int[row][column];
            
            for(int i = 0; i<block.length; i++){
                l[block[i][0]-1][block[i][1]-1] = -1;
            }//end of for loop
            
            return l;
        }//end of builder
        
        /*
        Purpose: Make a string map of the labyrinth for output
        Input: labyrinth array(int[][])
        Output: String Map of Labyrinth
        */
        private String mapMaker(int[][] l){
            String map = "";
            
            for(int i = 0; i<l.length; i++){
                for(int j = 0; j<l[0].length; j++){
                    if(l[i][j] == -1){
                        map += "m ";
                    }//end of if monster
                    else if(i==0&&j==0){
                        map += "s ";
                    }//end of else if entrance
                    else if(i==l.length-1&&j==l[0].length-1){
                        map += "e ";
                    }//end of else if exit
                    else {
                        map += "o ";
                    }//end of else open
                }//end of inner for loop
                map += "\n";
            }//end of outter for loop
            
            return map;
        }//end of mapMaker
        
        
        
 	// ********** IO **********
 
 }  // end class