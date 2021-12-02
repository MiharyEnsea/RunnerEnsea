package com.company;

public class Hero extends AnimatedThing {
    //    constructor
    private double invicibility = -1;

    public Hero(double x, double y, String fileName) {
        super(x, y, fileName);
    }


    public boolean isInvincible() {
        if (this.invicibility > 0) {
            return true;
        }
        return false;
    }

    public void loseInvincible(long time){
        this.invicibility-= time;
    }

    public void setInvicibility ( double invicibility){
        this.invicibility = invicibility;
    }

    public double getInvicibility() {
        return invicibility;
    }
}
