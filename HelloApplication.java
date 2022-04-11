package com.example.secondpart;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.VLineTo;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Group group = new Group();
        Button check = new Button("Check");
        Button reset = new Button("Reset");
        Text welcome = new Text("-Magic Square- Please enter numbers from 1-9 without repeating them : ");
        Rectangle[] a = new Rectangle[5];
        Line lineH1 = new Line(150, 200, 150, 50);
        Line lineH2 = new Line(250, 200, 250, 50);
        Line lineV3 = new Line(100, 150, 300, 150);
        Line lineV4 = new Line(100, 100, 300, 100);

        welcome.setLayoutX(30);
        welcome.setLayoutY(30);
        check.setLayoutX(150);
        check.setLayoutY(250);
        reset.setLayoutX(210);
        reset.setLayoutY(250);





        group.getChildren().addAll(lineH1, lineH2, lineV3, lineV4, check, reset, welcome);

        Scene scene = new Scene(group, 650, 400);
        stage.setTitle("Magic Square");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}