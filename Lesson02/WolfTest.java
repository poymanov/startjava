public class WolfTest {

	public static void main(String[] args) {
		Wolf wolf = new Wolf();

		wolf.sex = "male";
		wolf.name = "Ron";
		wolf.weight = 55.5f;
		wolf.age = 5;
		wolf.color = "Brown";

		System.out.println(wolf.sex);
		System.out.println(wolf.name);
		System.out.println(wolf.weight);
		System.out.println(wolf.age);
		System.out.println(wolf.color);

		wolf.go();
		wolf.sit();
		wolf.run();
		wolf.howl();
		wolf.hunt();
	}
}