package com.spc.second;

public class hero4 extends Hero{
    public hero4(String name, int blood, String rank, int fight, String ID) {
        super(name, blood, rank, fight, ID);
    }

    public void skill(){

        System.out.println(getName()+getID()+"释放天动万象技能");
        blood-=5;
    }
}
