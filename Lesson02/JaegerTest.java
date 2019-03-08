public class JaegerTest {
  
    public static void main(String[] args) {
        Jaeger brawlerYukon = new Jaeger();
        
        brawlerYukon.setModelName("Brawler Yukon");
        brawlerYukon.setMark("Mark-1");

        System.out.println(brawlerYukon.getModelName());
        System.out.println(brawlerYukon.getMark());

        Jaeger crimsonTyphoon = new Jaeger();

        crimsonTyphoon.setModelName("Crimson Typhoon");
        crimsonTyphoon.setMark("Mark-4");

        System.out.println(crimsonTyphoon.getModelName());
        System.out.println(crimsonTyphoon.getMark());
    }
}