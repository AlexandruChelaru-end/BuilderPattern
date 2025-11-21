//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        User user = new User.Builder()
                .setName("Ana")
                .setAge(25)
                .setCity("București")
                .build();

        System.out.println(user);



        HouseBuilder builder = new WoodenHouseBuilder();
        Director director = new Director(builder);
        House house = director.construct();
        System.out.println(house);
    }
}
