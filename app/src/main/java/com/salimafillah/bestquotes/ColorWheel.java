package com.salimafillah.bestquotes;

import android.graphics.Color;
import java.util.Random;

/**
 * Created by Dede Iskandar on 28/12/2014.
 */


public class ColorWheel {

    // Member variable (properties about the object)
    private String[] mColors = {
            "#39add1",
            "#3079ab",
            "#c25975",
            "#e15258",
            "#f9845b",
            "#838cc7",
            "#7d669e",
            "#53bbb4",
            "#51b46d",
            "#e0ab18",
            "#637a91",
            "#f092b0",
            "#b7c0c7",
            "#1abc9c",
            "#16a085",
            "#2ecc71",
            "#27ae60",
            "#3498db",
            "#2980b9",
            "#9b59b6",
            "#8e44ad",
            "#34495e",
            "#2c3e50",
            "#f1c40f",
            "#f39c12",
            "#e67e22",
            "#d35400",
            "#d35400",
            "#c0392b",
            "#7f8c8d"
    };

    // Method (abilities: things the object can do)
    public int getColor() {

        String color = "";

        // Randomly select a fact
        Random randomGenerator = new Random();  // Construct a new Random number generator
        int randomNumber = randomGenerator.nextInt(mColors.length);

        color = mColors[randomNumber];
        int colorAsInt = Color.parseColor(color);

        return colorAsInt;
    }
}

