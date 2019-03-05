public class WolfTest {
  
  public static void main(String[] args) {
    Wolf wolf = new Wolf();

    wolf.setSex("male");
    wolf.setName("Ron");
    wolf.setWeight(55.5f);
    wolf.setColor("Brown");

    System.out.println(wolf.getSex());
    System.out.println(wolf.getName());
    System.out.println(wolf.getWeight());
    System.out.println(wolf.getColor());

    wolf.setAge(28);

    wolf.setAge(8);

    System.out.println(wolf.getAge());

    wolf.go();
    wolf.sit();
    wolf.run();
    wolf.howl();
    wolf.hunt();
  }
}