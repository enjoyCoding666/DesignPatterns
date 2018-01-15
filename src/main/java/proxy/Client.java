package proxy;

public class Client {
    public static void main(String[] args) {
        People people=new People(20*1000,"jack","");
        People people2=new People(5*1000, "tom","vip" );

        ProxyShop proxyShop=new ProxyShop();
        proxyShop.setPeople(people);
        proxyShop.buyCar();

        ProxyShop proxyShop2=new ProxyShop();
        proxyShop2.setPeople(people2);
        proxyShop2.buyCar();
    }
}
