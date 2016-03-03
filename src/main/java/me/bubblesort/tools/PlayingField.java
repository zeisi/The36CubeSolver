package me.bubblesort.tools;

import me.bubblesort.model.Entry;

public class PlayingField {
    public static Entry[][] generate(){
        Entry[][] playingField = new Entry[6][6];

        //left to right, top to bottom
        playingField[0][0] = new Entry(1);
        playingField[0][1] = new Entry(3);
        playingField[0][2] = new Entry(4);
        playingField[0][3] = new Entry(5);
        playingField[0][4] = new Entry(2);
        playingField[0][5] = new Entry(0);

        playingField[1][0] = new Entry(2);
        playingField[1][1] = new Entry(5);
        playingField[1][2] = new Entry(0,1); //special yellow 5er
        playingField[1][3] = new Entry(4);
        playingField[1][4] = new Entry(1);
        playingField[1][5] = new Entry(3);

        playingField[2][0] = new Entry(0);
        playingField[2][1] = new Entry(1);
        playingField[2][2] = new Entry(3);
        playingField[2][3] = new Entry(2);
        playingField[2][4] = new Entry(5);
        playingField[2][5] = new Entry(4);

        playingField[3][0] = new Entry(5);
        playingField[3][1] = new Entry(4);
        playingField[3][2] = new Entry(1,0); //special orange 6er
        playingField[3][3] = new Entry(3);
        playingField[3][4] = new Entry(0);
        playingField[3][5] = new Entry(2);

        playingField[4][0] = new Entry(4);
        playingField[4][1] = new Entry(2);
        playingField[4][2] = new Entry(5);
        playingField[4][3] = new Entry(0);
        playingField[4][4] = new Entry(3);
        playingField[4][5] = new Entry(1);

        playingField[5][0] = new Entry(3);
        playingField[5][1] = new Entry(0);
        playingField[5][2] = new Entry(2);
        playingField[5][3] = new Entry(1);
        playingField[5][4] = new Entry(4);
        playingField[5][5] = new Entry(5);

        return playingField;
    }

    public static String getColor(int colorCode){
        switch(colorCode){
            case 0:
                return "o";
            case 1:
                return "y";
            case 2:
                return "g";
            case 3:
                return "b";
            case 4:
                return "p";
            case 5:
                return "r";
        }
        return "error";
    }

    public static Entry [][] copy (Entry [][] playingField) {
        Entry [][] copyField = new Entry[playingField.length][playingField[0].length];
        for (int i = 0; i<playingField.length;++i) {
            for (int j = 0; j < playingField[i].length; ++j) {
                Entry e = new Entry(playingField[i][j]);
                copyField[i][j] = e;
            }
        }
        return copyField;
    }
}
