package com.company;

import javafx.animation.AnimationTimer;
import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

abstract public class AnimatedThing {
    private double x;
    private double y;
    private ImageView sprite;
    private Integer attitude;
    private int index =0;
    private int delay=0;
    private int maxIndex=5;
    private int retard_jump=0;
    private int sizeWin;
    private int offset;

    //methodes


//    constructors


    public AnimatedThing(double x, double y, String fileName) {
        //this.x = x;
        //this.y = y;
//        this.sprite = sprite;
        Image spriteSheet = new Image(".\\heros.png");
        sprite = new ImageView(spriteSheet);
        sprite.setViewport(new Rectangle2D(this.index,0,75,100));
        sprite.setX(x);
        sprite.setY(y);

    }

    public void update(long time) {
        if (this.delay == 5) {
            if (index < maxIndex) {
                index += 1;
            } else index = 1;

            this.sprite.setViewport(new Rectangle2D(index * 85, 0, 80, 100));
            if(y<250) {  //gravité
                this.y += 65;
                this.sprite.setY(this.y);
            }
            else {
                this.y=250;
                this.sprite.setY(this.y);
            }
            delay = 0;
        } else delay++;
    }
    public void jump(){
        int dy=0;
        dy += 1;
        getSprite().setY(dy);
    }






    public ImageView getSprite() {
        return sprite;
    }
}


