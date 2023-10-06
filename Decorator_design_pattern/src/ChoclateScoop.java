public class ChoclateScoop implements IcecreamCone{

    private IcecreamCone icecreamCone;

    public ChoclateScoop(IcecreamCone icecreamCone)
    {
        this.icecreamCone = icecreamCone;
    }

    @Override
    public int getCost() {
        return icecreamCone.getCost() + 20;
    }

    @Override
    public String getConstituents() {
        return icecreamCone.getConstituents()+ " "+ "chocolate";
    }
}
