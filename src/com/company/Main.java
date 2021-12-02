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
import javafx.scene.media.AudioClip;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

;import java.io.File;


public class Main extends Application{



    public void start(Stage primaryStage) throws Exception{
//        playSound("theme.wav");
        primaryStage.setTitle("Runner");
        Group root = new Group();
        Pane pane = new Pane(root);
        GameScene gameScene = new GameScene(pane,600, 400);
        Image icon = new Image(".\\logo.png");




        primaryStage.getIcons().add(icon);
        primaryStage.setResizable(true);
        primaryStage.setScene(gameScene);
        primaryStage.show();
    }

//    public void playSound(String fileName){
//        String path = getClass().getResource(fileName).getPath();
//        Media media = new Media(new File(path).toURI().toString());
//        MediaPlayer mediaPlayer = new MediaPlayer(media);
//        mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE);
//        mediaPlayer.play();
//    }
//












    public static void main(String[] args) {
        launch(args);
        // write your code here


    }

}