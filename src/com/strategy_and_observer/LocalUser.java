public class LocalUser extends User {

    public LocalUser(String name) {
        super(name);
    }

    public void deliver(String s) {
        System.out.println("Пользователю " + name + " был отправлен товар " + s + " курьерской службой");
    }
}
