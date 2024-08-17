package com.najmaldeen;

public class Human {
    private String f_name;
    private String l_name;

    public void printFN(){
        System.out.println(f_name + " " + l_name);
    }
    public void printInfo (){
        System.out.println(f_name + " " + l_name + " is a human");
    }





    public void setF_name(String f_name) {
        this.f_name = f_name;
    }

    public void setL_name(String l_name) {
        this.l_name = l_name;
    }

    public String getF_name() {
        return f_name;
    }

    public String getL_name() {
        return l_name;
    }
}
