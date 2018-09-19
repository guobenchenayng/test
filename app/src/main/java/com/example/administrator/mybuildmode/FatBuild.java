package com.example.administrator.mybuildmode;


public class FatBuild implements Builder {
    private Person person = new Person();

    @Override
    public FatBuild buildHeader() {
        person.setHeader("--------胖子头");
        return this;
    }

    @Override
    public FatBuild buildBody() {
        person.setBody("--------胖子身体");
        return this;
    }

    @Override
    public FatBuild buildHands() {
        person.setHands("--------胖子手");
        return this;
    }

    @Override
    public FatBuild buildFooter() {
        person.setFooter("--------胖子脚");
        return this;
    }

    @Override
    public Person result() {
        return person;
    }
}
