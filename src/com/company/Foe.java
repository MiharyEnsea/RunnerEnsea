package com.company;

import javafx.geometry.Rectangle2D;



public class Foe extends staticThing {
    public Foe(String fileName, double x, double y) {
        super(fileName, x, y);
        this.getImageView().setViewport(new Rectangle2D(50, 50, 70, 160));
    }

    private int dx = 0;
    private int index=1;
    private int maxIndex=6;
    private int delay = 0;

    public void deplacement(long time, int ecart) {
        if(this.dx == -2000) this.dx=0;
        this.dx -= 5;
        this.getImageView().setX(1000 +this.dx + ecart);
    }

    public void flammeAnim() {
        if (delay == 5) {
            if (index < maxIndex) {
                index += 1;
            } else index = 1;
            this.getImageView().setViewport(new Rectangle2D(4* index * 50, 50, 90, 183));
            delay=0;
        }
        delay++;
    }
}
