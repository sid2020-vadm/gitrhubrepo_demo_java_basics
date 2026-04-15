package programs.hackerRank.pageFactoryDesign;

public class FoodFactory {

    public static Food getFood(String order){
        switch (order.toLowerCase()){
            case "cake": return new Cake();
            case "pizza": return new Pizza();
            default:throw new RuntimeException("incorrect selection");
        }
    }
}
