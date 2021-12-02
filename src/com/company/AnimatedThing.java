package com.company;

import javafx.animation.AnimationTimer;
import javafx.animation.TranslateTransition;
import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.transform.Translate;
import javafx.util.Duration;

abstract public class AnimatedThing {
    private double x;
    private double y;
    private ImageView sprite;
    private Integer attitude=1;//run
    private int index =0;
    private int delay=0;
    private int maxIndex=5;
    private int retard_jump=0;
    private int sizeWin;
    private int offset;
    private int numJump=0;

    //methodes


//    constructors


    public AnimatedThing(double x, double y, String fileName) {
        //this.x = x;
        //this.y = y;
//        this.sprite = sprite;
        Image spriteSheet = new Image(fileName);
        sprite = new ImageView(spriteSheet);
        sprite.setViewport(new Rectangle2D(this.index,0,75,100));
        sprite.setX(x);
        sprite.setY(y);

    }

    public void update(long time) {
        if (this.delay == 5) {
            if (this.attitude==1) {
                if (index < maxIndex) {
                    index += 1;
                } else index = 1;
                this.sprite.setViewport(new Rectangle2D(index * 85, 0, 80, 100)); // run
                if(this.y<230) {  //gravité
                    this.y += 40;
                    this.sprite.setViewport(new Rectangle2D(88, 160, 90, 100));
                    this.sprite.setY(this.y);
                }
                else {
                    this.y=250;
                    this.sprite.setY(this.y);
                }
            }
            if(this.attitude==2) {
                if(this.y>50) {
                    this.y -= 150;
                    this.sprite.setViewport(new Rectangle2D(0, 160, 90, 100));//saut
                    this.sprite.setY(this.y);
                }
                else {
                    setAttitude(1);
                }
            }

            delay = 0;
        } else delay++;
//        System.out.println(attitude);
    }
    public void jump(){
//        int vy=200;
//        while(this.y > 150){
//            this.y -= vy;
//        this.attitude = 2; //jump
//        this.sprite.setViewport(new Rectangle2D(80, 160, 90, 100));
//        this.sprite.setY(this.y);
//        TranslateTransition translateTransition = new TranslateTransition();
//        translateTransition.setDuration(Duration.millis(250));
//        translateTransition.setNode(this.sprite);
//        translateTransition.setByY(-100);
////            translateTransition.setCycleCount(2);
////            translateTransition.setAutoReverse(true);
//        translateTransition.play();
        setAttitude(2);



        }
//        else{
//            this.y += vy*time;
//            this.sprite.setY(this.y);
//        }

    public boolean Rectangle2DgetHitBox(ImageView perso1, ImageView perso2){
        return perso1.getBoundsInParent().intersects(perso2.getBoundsInParent());
    }









    public ImageView getSprite() {
        return sprite;
    }

    public Integer getAttitude() {
        return attitude;
    }

    public void setAttitude(Integer attitude) {
        this.attitude = attitude;
    }
}


