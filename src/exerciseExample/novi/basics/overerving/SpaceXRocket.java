package exerciseExample.novi.basics.overerving;

public class SpaceXRocket extends Rocket {
    // We roepen hier de constructor aan van Rocket
    public SpaceXRocket(int maximumFuel) {
        super(maximumFuel);

    }

    // Binnen de hele opdracht is het enige wat aangepast wordt hieronder vermeld:
    @Override
    public int calculateMetersFlown(int fuel) {
        return super.calculateMetersFlown(fuel) + fuel * 50;
    }
}
