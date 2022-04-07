package com.spc.second;

public class hero2 extends Hero{
    public hero2(String name, int blood, String rank, int fight, String ID) {
        super(name, blood, rank, fight, ID);
    }

    public void skill(){
        System.out.println(getName()+getID()+"释放静谧之眼技能");
        blood-=5;
    }
}
