package proxy;

public class People implements BuyCar {
    private int cash;
    private String vip;
    private String userName;

    @Override
    public void buyCar() {
        System.out.println("用VIP买车");
    }

    public People(int cash,  String userName ,String vip) {
        this.cash = cash;
        this.vip = vip;
        this.userName = userName;
    }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public String getVip() {
        return vip;
    }

    public void setVip(String vip) {
        this.vip = vip;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
