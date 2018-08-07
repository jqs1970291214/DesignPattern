package DesignPattern.visitor;

/**
 * summary
 * descripttions
 *
 * @author Junqson
 * @date 2018/8/7 13:50
 */
public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer();
        ComputerPartVisitor visitor = new ComputerPartDisplayVisitor();
        computer.accept(visitor);
    }
}
