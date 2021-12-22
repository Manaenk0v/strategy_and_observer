public class SeaLogistics extends Logistics {

    @Override
    public void deliver(User user, String[] goods) {
        if (user instanceof OverseaUser overseaUser) {
            for (String s : goods) {
                overseaUser.deliver(s);
            }
            // другие действия, связанные с доставкой по морю
        }
    }
}
