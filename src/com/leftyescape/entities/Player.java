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

    public void moveUp() {

        if (body.getY() > 0) {
            body.setY(body.getY() - 5);
        }

    }

    public void moveDown() {

        if (body.getY() < 560) {
            body.setY(body.getY() + 5);
        }

    }

    public void moveLeft() {

        if (body.getX() > 0) {
            body.setX(body.getX() - 5);
        }

    }

    public void moveRight() {

        if (body.getX() < 760) {
            body.setX(body.getX() + 5);
        }

    }

}