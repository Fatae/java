//package com.spc.test01;
//
//public class point {
//    int x=0;
//    int y=0;
//    public point(int x,int y){
//        this.x=x;
//        this.y=y;
//    }
//    int thickness=1;
//    public int getThickness(){
//        return thickness;
//    }
//    public void setThickness(int thickness){
//        if(thickness>=1&&thickness<=7){
//        this.thickness=thickness;
//        }else {
//            this.thickness=1;
//        }
//    }
//    int color=16;
//    public void setColor(int color){
//        if(color>=0&&color<=16){
//            this.color=color;
//        }else{
//            this.color=16;
//        }
//    }
//    public double count(int x,int y,int x1,int y1){
//        return Math.sqrt((x-x1)*(x-x1)+(y-y1)*(y-y1));
//    }
//    public String toString(){
//        return "坐标为"+x+","+y+"粗细为"+thickness+"颜色为"+color+
//                "长度为"+count()
//    }
//}
