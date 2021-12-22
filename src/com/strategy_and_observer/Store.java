import java.util.ArrayList;
import java.util.List;

public class Store {
    public List<String> goods = new ArrayList<>();
    public List<Customer> customers = new ArrayList<>();

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void removeCustomer(Customer customer) {
        customers.remove(customer);
    }

    public void sendGoods(String s) {
        goods.add(s);

        for (Customer customer : customers) { // оповещаем покупателей о поступлении товара
            customer.notify(s);
        }
    }
}
