package me.bubblesort;

import me.bubblesort.model.Entry;
import me.bubblesort.tools.PlayingField;

import java.util.ArrayList;
import java.util.List;

public class The36CubeSolver {
    static List<Entry[][]> solutions = new ArrayList<Entry [][]>();
    static int noOfSolutions = 0;

    public static void main(String[] args) {
        Entry[][] playingField = PlayingField.generate();

        int [][] remainingColours = new int[6][6];
        remainingColours [0][0] = 1;
        remainingColours [1][1] = 1;

        recursiveCall(playingField, remainingColours, 0);
        solutions.forEach(The36CubeSolver::printPlayingField);
        System.out.println("Found "+ noOfSolutions + " solutions.");
    }

    public static void recursiveCall(Entry [][] playingField, int [][] colours, int pos) {
        int x = pos/6;
        int y = pos%6;
        if (pos >= 36) {
            //Jeanne was here!
            solutions.add(playingField);
            noOfSolutions++;
            return;
        }
        else if (playingField[x][y].colour <= 5) {
            recursiveCall (playingField, colours, pos + 1);
        }
        else {
            int nextpos = pos + 1;
            int height = (playingField [x][y]).height;
            int [] forbiddencols = new int [6];
            for (int j = 0; (j < x) || (j < y); ++j) {
                if (j<y) {
                    int colour = (playingField [x][j]).colour;
                    forbiddencols [colour] = 1;
                }
                if (j < x) {
                    int colour = (playingField [j][y]).colour;
                    forbiddencols [colour] = 1;
                }

            }
            for (int i = 0; i < 6; ++i) {
                if (colours[i][height] == 0 && forbiddencols[i] == 0) {

                    int[][] nColours = copyColours(colours);
                    nColours[i][height] = 1;
                    Entry [][] nPlayingF = PlayingField.copy(playingField);
                    Entry e = nPlayingF[x][y];
                    e.colour = i;
                    recursiveCall(nPlayingF, nColours, nextpos);
                }
            }
        }

    }

    public static void printPlayingField(Entry[][] playingField){
        System.out.println("######################");
        for(int i = 0; i<playingField.length; i++){
            for(int j = 0; j<playingField[i].length; j++){
                System.out.print(PlayingField.getColor(playingField[i][j].colour) + "\t");
            }
            System.out.println("");
        }
    }

    public static int [][] copyColours(int [][] originalColours) {
        int [][] newColours = new int [6][6];
        for (int i = 0; i < 6; ++i) {
            for (int j = 0; j < 6; ++j) {
                newColours[i][j] = originalColours[i][j];
            }
        }
        return newColours;
    }

    public static void printColours(int [][] colours) {
        System.out.println("########################");
        for (int i = 0; i < colours.length; ++i) {
            for (int j = 0; j < colours[i].length; ++j) {
                System.out.print(colours[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
