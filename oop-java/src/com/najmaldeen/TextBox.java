package com.najmaldeen;

public class TextBox extends UIControls {
    private String text =""; // Field

//    public TextBox() {
//        super(true);
//        System.out.println("Text Box");
//    }


    @Override
    public void render() {
        System.out.println("Render from text box ");
    }

    @Override
    public String toString(){
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void clear() {
        text = "";
    }
}
