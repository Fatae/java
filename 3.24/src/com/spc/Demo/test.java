package com.spc.Demo;

class Demo{
    private int x=1;
    private int y=2;
    private class BwflnnerClass{
        private int x=3;
        public void print(){
            System.out.println(x+y);
        }

    }

    public static void main(String[] args) {
        new Demo().new BwflnnerClass().print();

    }
}