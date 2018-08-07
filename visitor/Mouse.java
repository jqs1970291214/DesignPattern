package DesignPattern.visitor;

/**
 * summary
 * descripttions
 *
 * @author Junqson
 * @date 2018/8/7 13:40
 */
public class Mouse implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor visitor) {
        visitor.visit(this);
    }
}
