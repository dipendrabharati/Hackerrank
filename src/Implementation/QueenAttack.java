import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class QueenAttack {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int r_q = in.nextInt();
        int c_q = in.nextInt();

        //Row Column coordinates of the closes object in each direction
        int rRObstacle = -1;
        int cRObstacle = -1;
        int rBRObstacle = -1;
        int cBRObstacle = -1;
        int rBObstacle = -1;
        int cBObstacle = -1;
        int rBLObstacle = -1;
        int cBLObstacle = -1;
        int rLObstacle = -1;
        int cLObstacle = -1;
        int rTLObstacle = -1;
        int cTLObstacle = -1;
        int rTObstacle = -1;
        int cTObstacle = -1;
        int rTRObstacle = -1;
        int cTRObstacle = -1;

        //Total squares attacked by the queen
        int reachableSquares = 0;

        //Finds the closest object in each direction
        for(int a0 = 0; a0 < k; a0++){
            int rObstacle = in.nextInt();
            int cObstacle = in.nextInt();

            //Right
            if((cObstacle < cRObstacle || rRObstacle == -1) && cObstacle > c_q && rObstacle == r_q)
            {
                rRObstacle = rObstacle;
                cRObstacle = cObstacle;
            }

            //Bottom Right
            if(r_q - rObstacle == cObstacle - c_q && cObstacle > c_q && rObstacle < r_q
                    && ((rObstacle > rBRObstacle && cObstacle < cBRObstacle) || rBRObstacle == -1))
            {
                rBRObstacle = rObstacle;
                cBRObstacle = cObstacle;
            }

            //Bottom
            if((rObstacle > rBObstacle || rBObstacle == -1) && rObstacle < r_q && cObstacle == c_q)
            {
                rBObstacle = rObstacle;
                cBObstacle = cObstacle;
            }

            //Bottom Left
            if(r_q - rObstacle == c_q - cObstacle && cObstacle < c_q && rObstacle < r_q
                    && ((rObstacle > rBLObstacle && cObstacle > cBLObstacle) || rBLObstacle == -1))
            {
                rBLObstacle = rObstacle;
                cBLObstacle = cObstacle;
            }

            //Left
            if((cObstacle > cLObstacle || rLObstacle == -1) && cObstacle < c_q && rObstacle == r_q)
            {
                rLObstacle = rObstacle;
                cLObstacle = cObstacle;
            }

            //Top Left
            if(c_q - cObstacle == rObstacle - r_q && cObstacle < c_q && rObstacle > r_q
                    && ((rObstacle < rTLObstacle && cObstacle > cTLObstacle) || rTLObstacle == -1))
            {
                rTLObstacle = rObstacle;
                cTLObstacle = cObstacle;
            }

            //Top
            if((rObstacle < rTObstacle || rTObstacle == -1) && rObstacle > r_q && cObstacle == c_q)
            {
                rTObstacle = rObstacle;
                cTObstacle = cObstacle;
            }

            //Top Right
            if(rObstacle - r_q == cObstacle - c_q && cObstacle > c_q
                    && rObstacle > r_q && ((rObstacle < rTRObstacle && cObstacle < cTRObstacle) || rTRObstacle == -1))
            {
                rTRObstacle = rObstacle;
                cTRObstacle = cObstacle;
            }

        }

        //Calculates the distance to the closest obstacle in each direction and adds it to reachableSquares
        //R B L T
        reachableSquares += (cRObstacle != -1) ? (cRObstacle - c_q -1) : n - c_q;
        reachableSquares += (rBObstacle != -1) ? (r_q - rBObstacle - 1) : r_q - 1;
        reachableSquares += (cLObstacle != -1) ? (c_q - cLObstacle -1) : c_q - 1;
        reachableSquares += (rTObstacle != -1) ? (rTObstacle - r_q - 1) : n - r_q;

        //BR BL TL TR
        reachableSquares += (cBRObstacle != -1) ? (cBRObstacle - c_q -1) : Math.min(n - c_q, r_q - 1);
        reachableSquares += (rBLObstacle != -1) ? (c_q - cBLObstacle - 1) : Math.min(c_q - 1, r_q - 1);
        reachableSquares += (cTLObstacle != -1) ? (c_q - cTLObstacle -1) : Math.min(c_q - 1, n - r_q);
        reachableSquares += (rTRObstacle != -1) ? (cTRObstacle - c_q - 1) : Math.min(n - c_q, n - r_q);
        System.out.println(reachableSquares);
    }
}

// How many squares the queen can attack?
// Each is referenced by a tuple ( r, c)
// queens position : (4, 4)  obstacle position = ( 3,5)
// the number of squares the  queen can attack without any obstacles = 27, how to get 27?
// At any position, the queen can go in four direction: R + C + D1 + D2 = 27
// R = (c-1) = 8-1 =7  and C = (r-1) = 7
// D2 = (
// Its a reflection, (2,1)/ (1,2)
// chessboard = 4 * 4, queen's position = (4, 4),  R = 4-1= 3, C= 4-1=3, D1=4-1= 3, 3+3+3=9
// chessboard = 5 * 5, queen's position = ( 4, 3), obstacles = (5,5), (4,2), (2,3)

// step 1: R = 5-1 = 4   step 2: obstacles ( if same row, (4,2), R - c = 4-2= 2
// step 1: C = 5-1 = 4,  step 2: obstacles ( if same col, (2,3), C - r = 4-2= 2

// D1= 4-1= 3
// D2=3 , total= 10

//Diagnals(colums) = 1,1 =8 , (1,2) = 7, (1,3)=6, (1,4)=5 ....
// Diagnals(rows) = (1,1)= (8,0),  (2,1) = (7,2), (3,1)= (6,3), (4,1)= (5, 4), (5,1) =(4,5)

// Diagnals = (4,1)=(5,4), (4,2)= (6,5), (4,3)= (7,6), (4,4)=(8,7), (4,5)=(8,7), (4,6)=(7,6), (4,7)=(6,5), (4,8)=(5,4)
//What I am looking at?
//(2,6)

// What I don't understand? : In each direction, we are looking for closest obstacle with relation to queen
// Calculate the squares using the distance between two points for each closest obstacle
// Why the initial value of the closest obstacle in each direction is '-1'?

// Case 1: If the column of the given Ob is less than column of the Ob in right direction OR the row of the nearest
// >>> Ob is -1   and  colum of the  given Ob is greater than column of the queen  and  row of Ob is row of queen
// >>> row of nearest right Ob = row of the given obstacle

// Case 2: If row of the queene - row of the Ob is equal to column of Ob - column of queen   andand column of Ob is
// >>> greater than colum of queen and row of Ob is less than row of queen an
// Basically, the first half checks that the the obstacle is in bottom right, and second half check if the obstacle is
// >>> is the nearest one.