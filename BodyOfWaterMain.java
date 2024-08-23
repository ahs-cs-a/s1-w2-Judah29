public class BodyOfWaterMain {
    public static void main(String[] args) {
        BodyOfWater b = new BodyOfWater("Tahoe", 150, 62.84, false);
        BodyOfWater b2 = new BodyOfWater("Lake Anza", 43.12);

        System.out.println(b.name());
        System.out.println(b.largestDiameter());
        System.out.println(b.avgDepth());
        System.out.println(b.isSaltWater());
        System.out.println(b2.name());
        System.out.println(b2.avgDepth());
        b2.setName("Anzaa");
        System.out.println(b2.name());
        b.setlargestDiameter(26);
        System.out.println(b.largestDiameter());
    }

}
