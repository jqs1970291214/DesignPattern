package DesignPattern.template;

/**
 * summary
 * descripttions
 *
 * @author Junqson
 * @date 2018/8/6 10:37
 */
public abstract class Game {
    abstract void initialize();

    abstract void startPlay();

    abstract void endPlay();

    // 模板 final 禁止被恶意重写
    public final void play() {
        // 初始化
        initialize();
        //开始游戏
        startPlay();
        //结束游戏
        endPlay();
    }
}
