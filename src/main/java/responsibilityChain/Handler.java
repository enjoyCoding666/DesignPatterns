package responsibilityChain;

public abstract class Handler {
    /**
     * 后继的责任对象
     */
    private Handler nextHandler;

    public abstract void handleRequest();

    public Handler getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
