package com.example.student.synthbeat;

import android.content.Context;
import android.graphics.Color;
import android.view.View;

/**
 * Created by student on 2016-11-29.
 */

public class Cell extends View {
    float width;
    float height;

    int color;

    public Cell(Context context, float width, float height) {
        super(context);

        this.width = width;
        this.height = height;

        this.color = Color.RED;
    }


}
