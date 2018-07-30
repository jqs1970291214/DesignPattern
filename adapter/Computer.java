package DesignPattern.adapter;

/**
 * summary
 * descripttions
 *
 * @author Junqson
 * @date 2018/7/30 21:08
 */
public class Computer {
    private String name;
    public void readInfo(String msg, String outDevice){
        System.out.println(name + " read " + msg + " from " + outDevice );
    }

    public void setName(String name) {
        this.name = name;
    }
}
