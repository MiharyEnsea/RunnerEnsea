package com.company;

import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BackgroundImage;

public class staticThing {
   private double x;
   private double y;
   private ImageView imageView;
   private int xFond = 0;

    public staticThing(String fileName, double x, double y) {
        Image image = new Image(fileName);
        ImageView imageView = new ImageView(image);
        this.imageView = imageView;
        this.imageView.setX(x);
        this.imageView.setY(y);

    }

    public ImageView getImageView() {
        return imageView;
    }

    public void update1(long time, int ecart){
        if(this.xFond == -GameScene.LARGEUR_BACKGROUND) this.xFond =0;
        this.xFond-=5;
        this.imageView.setX(this.xFond + ecart);

    }
//    public void update2(long time){
//        this.imageView.setX(this.xFond + GameScene.LARGEUR_BACKGROUND);
//    }

}
