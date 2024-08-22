package com.najmaldeen;

public class CupOfTea {
    int water;
    private int sugarSpone;
    int teaPoder;

    public void prepareMyCup(){
        System.out.printf("Yor cup of tea has %d",sugarSpone);
    }

    public void setSugarSpone(int sugarSpone) throws Exception {
        if (sugarSpone > 10) {
            throw new Exception("sugar is a lot.");
        }
        this.sugarSpone = sugarSpone;
    }
}
