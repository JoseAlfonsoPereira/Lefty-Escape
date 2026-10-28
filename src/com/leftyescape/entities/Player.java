package com.leftyescape.entities;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Player {

    private Rectangle body;

    public Player(double x, double y) {

        body = new Rectangle(40, 40);

        body.setX(x);
        body.setY(y);

        body.setFill(Color.DODGERBLUE);
    }

    public Rectangle getBody() {
        return body;
    }
}