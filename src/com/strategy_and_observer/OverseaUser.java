public class OverseaUser extends User {

    public OverseaUser(String name) {
        super(name);
    }

    public void deliver(String s) {
        System.out.println("Пользователю " + name + " отправлен был товар " + s + " по морю");
    }
}
