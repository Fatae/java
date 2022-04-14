package com.spc.homework11;

public class homework11 {
    public static void main(String[] args) {
        try {
            if(args.length!=2){
                throw new ArrayIndexOutOfBoundsException("参数位数不对");
            }
            int a=Integer.parseInt(args[0]);
            int b=Integer.parseInt(args[1]);
            double res=cal(a,b);
            System.out.println(res);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e){
            System.out.println("格式不正确");
        }catch (ArithmeticException e){
            System.out.println("出现了除零的异常");
        }

    }
    public static double cal(int a,int b){

        return a/b;
    }
}
