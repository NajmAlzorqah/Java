package com.najmaldeen;

public abstract class  UIControls {
    private boolean isEnabled = true;

//    public UIControls(boolean isEnabled) {
//        this.isEnabled = isEnabled;
//        System.out.println("UI Control");
//    }

    // this method is for the polymorphism for the render implementation
    //each child class has its override method and its rendered automatically
    public abstract void render();

    public void enable(){
        isEnabled = true;
    }

    public void disable(){
        isEnabled = false;
    }

    public boolean isEnabled() {
        return isEnabled;
    }
}
