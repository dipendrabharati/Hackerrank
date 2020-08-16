/*
package Unsolved;

import java.util.ArrayList;

public class MagicSquareSolution {
    static ArrayList<Integer[][]> magicSquares = new ArrayList<Integer[][]>();

    public static void generateSquares(Integer[][] square, int[] usedNums, int startPos){

        //try each possible remaining digit for each table cell
        for(int j=1;j<=9;j++){
            if( usedNums[j]>0 ) continue;

            square[startPos/3][startPos%3]=j;

            //check that complete row equals 15
            if(startPos%3==2 &&
                    square[startPos/3][0]+square[startPos/3][1]+square[startPos/3][2]!=15){
                continue;
            }

            //check that complete column equals 15
            if(startPos/3>=2 &&
                    square[0][startPos%3]+square[1][startPos%3]+square[2][startPos%3]!=15){
                continue;
            }

            //check that complete diagonals equals 15
            if(startPos==6 &&
                    square[0][2]+square[1][1]+square[2][0]!=15 ){
                continue;
            }

            if(startPos==8 &&
                    square[0][0]+square[1][1]+square[2][2]!=15 ){
                continue;
            }

            int[] clonedUsedNums = usedNums.clone();
            clonedUsedNums[j]=j;

            if(startPos==8){
                Integer[][] newSquare = deepClone(square);
                magicSquares.add(newSquare);
            } else {
                generateSquares(square,clonedUsedNums,startPos+1);
            }
        }
    }
}
*/
