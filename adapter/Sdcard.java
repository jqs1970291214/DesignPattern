package DesignPattern.adapter;

/**
 * 内存卡类
 * descripttions
 *
 * @author Junqson
 * @date 2018/7/30 21:09
 */
public class Sdcard {
    private int multiple;
    public double write(){
        return Math.random() * multiple;
    }

    public void setMultiple(int multiple) {
        this.multiple = multiple;
    }
}
