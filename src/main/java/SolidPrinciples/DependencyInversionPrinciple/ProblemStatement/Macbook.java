package SolidPrinciples.DependencyInversionPrinciple.ProblemStatement;

public class Macbook {
    private WiredKeyboard keyboard;
    private WiredMouse mouse;

    public Macbook(WiredMouse mouse, WiredKeyboard keyboard) {
        this.mouse = mouse;
        this.keyboard = keyboard;
    }
}
