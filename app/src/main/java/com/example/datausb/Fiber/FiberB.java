package com.example.datausb.Fiber;

import android.graphics.Color;

/**
 * Created by sunset on 16/7/28.
 */
public class FiberB extends Fiber {
    private  static FiberB fiberB;
    private  FiberB(){

    }
    public static FiberB createFiberB(){
        if (fiberB==null){
            fiberB=new FiberB();
            fiberB.setFiberName("FiberB");
            fiberB.setFiberId('B');
            fiberB.setOptical1440Head(20);
            fiberB.setOptical1663Head(4);
        }
        return fiberB;
    }

    @Override
    public void setFiberColor() {
        fiberColor=Color.RED;
    }

}
