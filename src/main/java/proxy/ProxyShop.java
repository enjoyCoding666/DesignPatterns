package proxy;

public class ProxyShop implements BuyCar{
    private People people;

    public People getPeople() {
        return people;
    }

    public void setPeople(People people) {
        this.people = people;
    }

    @Override
    public void buyCar() {
        if(people.getVip()=="vip") {
            System.out.print(people.getUserName() );
            people.buyCar();
            return;
        }
        if(people.getCash()>=10*1000) {
            System.out.println(people.getUserName()+"钱足够可以买车");
        }else {
            System.out.println(people.getUserName()+"钱不够买车");
        }
    }



}
