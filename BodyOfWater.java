public class BodyOfWater {
    private String name;
    private int largestDiameter;
    private Double avgDepth;
    private Boolean isSaltWater;

    public BodyOfWater(String n, int d, Double a, Boolean s){
        name = n;
        largestDiameter = d;
        avgDepth = a;
        isSaltWater = s;
    }

    public BodyOfWater(String n, Double a){
        name = n;
        avgDepth = a;
    }

    public String name(){
        return name;
    }

    public int largestDiameter(){
        return largestDiameter;
    }

    public Double avgDepth(){
        return avgDepth;
    }
    public Boolean isSaltWater(){
        return isSaltWater;
    }

     public void setName(String n){
        name = n;
    }

    public void setlargestDiameter(int d){
        largestDiameter = d;
    }

}


