package DesignPattern.adapter;

/**
 * 内存卡适配器
 * descripttions
 *
 * @author Junqson
 * @date 2018/7/30 21:09
 */
public class Adapter {
    private Computer computer;
    private Sdcard sdcard;

    public void adapt(){
        //适配过程
        double info = sdcard.write();
        String msg = String.valueOf(info);
        computer.readInfo(msg, sdcard.toString());
    }

    public Adapter(int multiple,String compName){
        computer = new Computer();
        computer.setName(compName);

        sdcard = new Sdcard();
        sdcard.setMultiple(multiple);
    }

}
