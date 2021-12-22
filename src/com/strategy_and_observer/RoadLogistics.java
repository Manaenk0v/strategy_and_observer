public class RoadLogistics extends Logistics {

    @Override
    public void deliver(User user, String[] goods) {
        if (user instanceof LocalUser localUser) {
            for (String s : goods) {
                localUser.deliver(s);
            }
            // другие действия, связанные с доставкой курьером
        }
    }
}
