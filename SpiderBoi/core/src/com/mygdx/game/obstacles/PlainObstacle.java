package com.mygdx.game.obstacles;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;

/**
 * This class is the blueprint of the plainObstacle objects.
 * Only calls the parent constructor sets teh position and image.
 * @author JavaBoiz
 * @version 13.05.2019
 */
public class PlainObstacle
        extends Obstacle {

    //properties

    //constructor

    /**
     * Constructor for the plain obstacle, calls the parent constructor, it also initialises the image and the coordinates.
     * @param x is the x coordinate of the obstacle.
     * @param y is the y coordinate of the obstacle.
     */
    public PlainObstacle(int x, int y)
    {
        super();
        position = new Vector2(x, y);
        image = new Texture("PlainObstacle.png");
    }

    //methods


}
