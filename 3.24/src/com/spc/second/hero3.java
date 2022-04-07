package com.spc.second;

public class hero3 extends Hero{
    public hero3(String name, int blood, String rank, int fight, String ID) {

        super(name, blood, rank, fight, ID);
    }

    public void skill(){
        System.out.println(getName()+getID()+"释放花之印记技能");
        blood-=5;

    }
}
