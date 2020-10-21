package singletone_antipattern;

import singletone_antipattern.NdsResolver;

public class TaxCalculator {


    public TaxCalculator(NdsResolver mock) {
    }

    public double withNds(double price){

       return NdsResolverSingletone.getInstance().getNds()*price+price;

    }
}
