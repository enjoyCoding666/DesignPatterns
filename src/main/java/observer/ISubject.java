package observer;

/**
 * 主题接口
 */
public interface ISubject {
    /**
     * 注册观察者
     * @param observer
     */
    public void register(IObserver observer);

    /**
     * 注销观察者
     * @param observer
     */
   public void unregister(IObserver observer);

    /**
     * 通知所有观察者
     */
  public void notifyObservers();

}
