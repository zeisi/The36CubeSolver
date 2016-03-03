package me.bubblesort.model;

public class Entry {
    public Entry(int height) {
        this.height = height;
    }

    public Entry(int height, int colour) {
        this.height = height;
        this.colour = colour;
    }
    public Entry(Entry other) {
        this.height = other.height;
        this.colour = other.colour;
    }

    public int height;
    public int colour;


}
