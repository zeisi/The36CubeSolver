package me.bubblesort;

import me.bubblesort.model.Entry;
import me.bubblesort.tools.PlayingField;

public class The36CubeSolver {
    public static void main(String[] args) {
        Entry[][] playingField = PlayingField.generate();
        for(int i = 0; i<playingField.length; i++){
            for(int j = 0; j<playingField[i].length; j++){
                System.out.print(playingField[i][j].height + "\t");
            }
            System.out.println("");
        }
    }
}
