package com.spc.second;

public class hero1 extends Hero{


    public hero1(String name, int blood, String rank, int fight, String ID) {
        super(name, blood, rank, fight, ID);
    }

    public void skill(){
        System.out.println(getName()+getID()+"释放将进酒技能");
        blood-=5;
    }
}
