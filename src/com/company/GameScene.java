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
import javafx.geometry.Rectangle2D;

import java.util.ArrayList;

public class GameScene extends Scene {
    Camera camera;
    // Variables
    private int numJump=0;
    static final int LARGEUR_BACKGROUND = 800;


    // Constructeur
    public GameScene(Pane pane, double width, double height){
        super(pane, width, height, true);
        staticThing backgroundLeft = new staticThing(".\\desert.png", 0,0);
        staticThing backgroundRight = new staticThing(".\\desert.png", 0 +this.LARGEUR_BACKGROUND,0); // 800 la largeur de l'image




        Hero hero = new Hero(100,0 , ".\\heros.png" );
        ArrayList<Foe> foes = new ArrayList<Foe>();
        Foe foe1 = new Foe(".\\flamme.jpg", 250,200);
        foes.add(foe1);
        Foe foe2 = new Foe(".\\flamme.jpg", 550,200);
        foes.add(foe2);
        Foe foe3 = new Foe(".\\flamme.jpg", 750,200);
        foes.add(foe3);




        AnimationTimer timer = new AnimationTimer() {
            @Override
            public void handle(long time) {
                hero.update(time);
                backgroundLeft.update1(time, 0);
                backgroundRight.update1(time,LARGEUR_BACKGROUND);
                for(int i=0; i< foes.size();i++){
                    foes.get(i).deplacement(time,450*i);
                    foes.get(i).flammeAnim();
                    if(!hero.isInvincible()) {
                        if (hero.Rectangle2DgetHitBox(hero.getSprite(), foes.get(i).getImageView())) {
                            System.out.println("collision");
                            hero.setInvicibility(250000000);
                        }
                    }
                    else{
                        hero.loseInvincible(time);
                    }
                }
//                System.out.println(hero.getInvicibility());

            }
        };
        timer.start();

        this.addEventFilter(KeyEvent.KEY_PRESSED, (KeyEvent event)-> {
//            System.out.println("Key pressed");
            if (event.getCode() == KeyCode.SPACE) {
//                System.out.println("Space pressed");
                hero.jump();

            }
            event.consume();
        });




        pane.getChildren().add(backgroundLeft.getImageView());
        pane.getChildren().add(backgroundRight.getImageView());
        pane.getChildren().add(hero.getSprite());
        for(int i=0; i< foes.size();i++) {
            pane.getChildren().add(foes.get(i).getImageView());
        }
    }


    // methodes



    // getter


}
