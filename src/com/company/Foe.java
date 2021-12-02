package com.company;

import javafx.geometry.Rectangle2D;



public class Foe extends staticThing {
    public Foe(String fileName, double x, double y) {
        super(fileName, x, y);
        this.getImageView().setViewport(new Rectangle2D(50, 50, 70, 160));
    }

    private int dx = 0;

    public void deplacement(long time, int ecart) {
        //if(this.xFond == -GameScene.LARGEUR_BACKGROUND) this.xFond =0;
        this.dx -= 5;
        this.getImageView().setX(1000 +this.dx + ecart);
    }
}
