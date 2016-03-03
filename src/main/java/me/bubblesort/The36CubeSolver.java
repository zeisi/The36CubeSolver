package me.bubblesort;

import me.bubblesort.model.Entry;
import me.bubblesort.tools.PlayingField;

import java.util.ArrayList;
import java.util.List;

public class The36CubeSolver {
    static List<Entry[][]> solutions = new ArrayList<Entry [][]>();

    public static void main(String[] args) {
        Entry[][] playingField = PlayingField.generate();

        int [][] remainingColours = new int[6][6];
        remainingColours [0][0] = 1;
        remainingColours [1][1] = 1;

        recursiveCall(playingField, remainingColours, 0);
        for (Entry [][] field : solutions) {
            printPlayingField(field);
        }
    }

    public static void recursiveCall(Entry [][] playingField, int [][] colours, int pos) {

        if (pos >= 36) {
            solutions.add(playingField);
            System.out.println("Haha!");
            return;
        }
        if (pos == 20 || pos == 8) {
            recursiveCall (playingField, colours, pos + 1);
        }
        int height = (playingField [pos/6][pos%6]).height;
        int [] forbiddencols = new int [6];
        for (int j = 0; j <= pos%6; ++j) {
            int colour = (playingField [pos/6][j]).colour;
            forbiddencols [colour] = 1;
        }
        for (int j = 0; j <= pos/6; ++j) {
            int colour = (playingField [j][pos%6]).colour;
            forbiddencols [colour] = 1;
        }
        for (int i = 0; i < 6; ++i) {
            if (colours[i][height] == 0 && forbiddencols[i] == 0) {
                int[][] nColours = new int[6][6];
                System.arraycopy(colours, 0, nColours, 0, 36 * 0); // !!!! < @phi *0 is a placeholder
                colours[i][height] = 1;
                Entry e = playingField[pos/6][pos%6];
                e.colour = i;
                recursiveCall(playingField, colours, pos + 1);
                colours[i][height] = 0;
            }
        }
    }

    public static void printPlayingField(Entry[][] playingField){
        System.out.println("########################");
        for(int i = 0; i<playingField.length; i++){
            for(int j = 0; j<playingField[i].length; j++){
                System.out.print(playingField[i][j].height + "\t");
            }
            System.out.println("");
        }
    }
}
