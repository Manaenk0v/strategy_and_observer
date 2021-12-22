public class Main {

    public static void main(String[] args) {
        Logistics[] logisticsList = {new SeaLogistics(), new RoadLogistics()};
        User[] users = new User[2];
        users[0] = new LocalUser("Steve");
        users[1] = new OverseaUser("John");
        Store store = new Store();

        for (User user : users) {
            store.addCustomer(user);
        }

        store.sendGoods("Apples");
        store.sendGoods("Oranges");

        String[] goodsToDeliver = new String[store.goods.size()];
        store.goods.toArray(goodsToDeliver);

        // доставка тоавров
        for (User user : users) {
            Logistics logistics;
            if (user instanceof OverseaUser) {
                logistics = logisticsList[0];
            } else {
                logistics = logisticsList[1];
            }

            logistics.deliver(user, goodsToDeliver);
        }
    }

}
