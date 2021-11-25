package com.company;

import javafx.animation.AnimationTimer;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.SceneAntialiasing;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Paint;
import javafx.scene.layout.Pane;

public class GameScene extends Scene {
    Camera camera;
    // Variables
//    private Image imageBackground;
//    private ImageView imageViewBackground;
//
//    static int xFond;
    static final int LARGEUR_BACKGROUND = 800;


    // Constructeur
    public GameScene(Pane pane, double width, double height){
        super(pane, width, height, true);
//        xFond = 0;
        staticThing backgroundLeft = new staticThing(".\\desert.png", 0,0);
        staticThing backgroundRight = new staticThing(".\\desert.png", 0 +this.LARGEUR_BACKGROUND,0); // 800 la largeur de l'image
//        Image background = new Image("C:\\Users\\MCNrm\\OneDrive\\Documents\\ensea\\2a1\\s7\\info\\images_projet\\desert.png");
//        ImageView backgroundView = new ImageView(background); test affichage



        Hero hero = new Hero(100,0, ".\\heros.png" );

//        pane.getChildren().add(backgroundView);
        AnimationTimer timer = new AnimationTimer() {
            @Override
            public void handle(long time) {
                hero.update(time);
                backgroundLeft.update1(time, 0);
                backgroundRight.update1(time,LARGEUR_BACKGROUND);


            }
        };
        timer.start();
        this.addEventFilter(KeyEvent.KEY_PRESSED, (KeyEvent event)-> {
            System.out.println("Key pressed");
            if (event.getCode() == KeyCode.SPACE) {
                System.out.println("Space pressed");
                hero.jump();
            }
            event.consume();
        });


        pane.getChildren().add(backgroundLeft.getImageView());
        pane.getChildren().add(backgroundRight.getImageView());
        pane.getChildren().add(hero.getSprite());

        //root.getChildren().add(backgroundleft.getImageView());
    }


    // methodes




    // getter


}
