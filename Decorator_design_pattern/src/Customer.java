public class Customer {

    public static void main(String[] args) {
         //customer wants orange cone with 2 vanilla scoops then 1 chocolate scoop then 1 vanilla scoop

        IcecreamCone icecreamCone = new VanilllaScoop(
                new ChoclateScoop(
                        new VanilllaScoop(
                new VanilllaScoop(
                new OrangeCone()
                )
               )
                )
                );
    }
}
