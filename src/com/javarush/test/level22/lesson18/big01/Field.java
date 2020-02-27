package com.javarush.test.level22.lesson18.big01;

/**
 * Created by Макс on 18.12.2016.
 */
public class Field
{
    public int width;
    public int height;
    public int[][]matrix;

    public int getWidth()
    {
        return width;
    }

    public int getHeight()
    {
        return height;
    }

    public int[][] getMatrix()
    {
        return matrix;
    }

    public Field(int width, int height)
    {
        this.width = width;
        this.height = height;
        this.matrix = new int[height][width];
    }


}
