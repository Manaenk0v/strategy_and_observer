public abstract class User implements Customer {
    public final String name;

    public User(String name) {
        this.name = name;
    }

    public void notify(String s) {
        System.out.println("Покупатель " + name + " получил сообщение о поступлении товара " + s);
        // отправляем сообщение о поступлении нового товара
    }
}
