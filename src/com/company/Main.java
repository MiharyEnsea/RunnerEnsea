package com.company;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

;


public class Main extends Application{
//    private double pos = 0;


    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Runner");
        Group root = new Group();
        Pane pane = new Pane(root);
//        Scene scene = new Scene(root, 600, 400);
        GameScene gameScene = new GameScene(pane,600, 400);
        Image icon = new Image("C:\\Users\\MCNrm\\OneDrive\\Documents\\ensea\\2a1\\s7\\info\\images_projet\\logo.png");



        primaryStage.getIcons().add(icon);
        primaryStage.setResizable(true);
        primaryStage.setScene(gameScene);
        primaryStage.show();
    }
//









    public static void main(String[] args) {
        launch(args);
        // write your code here

    }

}