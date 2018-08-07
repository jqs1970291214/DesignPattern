package DesignPattern.visitor;

/**
 * summary
 * descripttions
 *
 * @author Junqson
 * @date 2018/8/7 13:39
 */
public class ComputerPartDisplayVisitor implements ComputerPartVisitor{
    @Override
    public void visit(Keyboard keyboard) {
        System.out.println(keyboard);
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println(monitor);
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println(mouse);
    }

    @Override
    public void visit(Computer computer) {
        System.out.println(computer);
    }
}
