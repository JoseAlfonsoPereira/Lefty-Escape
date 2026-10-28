package com.leftyescape;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import com.leftyescape.entities.Player;


public class Main extends Application {

    @Override
    public void start(Stage stage) {

        Pane root = new Pane();

        Player lefty = new Player(100, 100);

        root.getChildren().add(lefty.getBody());

        Scene scene = new Scene(root, 800, 600);

        scene.setOnKeyPressed(event -> {

            switch (event.getCode()) {

                case W:
                    lefty.moveUp();
                    break;

                case S:
                    lefty.moveDown();
                    break;

                case A:
                    lefty.moveLeft();
                    break;

                case D:
                    lefty.moveRight();
                    break;

                default:
                    break;
            }


        });

        stage.setTitle("Lefty Escape");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}