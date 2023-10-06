public class VanilllaScoop implements IcecreamCone{

    private IcecreamCone icecreamCone;
    public VanilllaScoop(IcecreamCone icecreamCone)
    {
        this.icecreamCone = icecreamCone;
    }
    @Override
    public int getCost() {
        return icecreamCone.getCost() + 15;
    }

    @Override
    public String getConstituents() {
        return icecreamCone.getConstituents()+ " " +"vanilla";
    }
}
