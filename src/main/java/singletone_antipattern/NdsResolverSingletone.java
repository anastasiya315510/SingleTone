package singletone_antipattern;

public class NdsResolverSingletone {
    private static NdsResolverSingletone ourInstance = new NdsResolverSingletone();
    public static NdsResolverSingletone  getInstance(){ return ourInstance;}

    public NdsResolverSingletone() {
    }
    public double getNds(){
        return 0.2;
    }
}
