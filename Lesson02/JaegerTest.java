public class JaegerTest {
  
    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger();
        Jaeger jaeger2 = new Jaeger();

        jaeger1.setModelName("Brawler Yukon");
        jaeger1.setMark("Mark-1");

        System.out.println(jaeger1.getModelName());
        System.out.println(jaeger1.getMark());

        jaeger2.setModelName("Crimson Typhoon");
        jaeger2.setMark("Mark-4");

        System.out.println(jaeger2.getModelName());
        System.out.println(jaeger2.getMark());
    }
}