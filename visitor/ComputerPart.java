package DesignPattern.visitor;

/**
 * summary
 * descripttions
 *
 * @author Junqson
 * @date 2018/8/7 13:39
 */
public interface ComputerPart {
    void accept(ComputerPartVisitor visitor);
}
