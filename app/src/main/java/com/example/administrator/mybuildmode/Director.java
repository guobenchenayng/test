package com.example.administrator.mybuildmode;

public class Director {
    private Builder mBuilder;

    public Director(Builder builder){
        this.mBuilder = builder;
    }

    public void constrct(){
        mBuilder.buildHeader();
        mBuilder.buildBody();
        mBuilder.buildHands();
        mBuilder.buildFooter();


        
    }

}
