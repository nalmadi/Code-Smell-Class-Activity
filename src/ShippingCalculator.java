abstract class Package{
    double weightCost;
    public Package(){

    }
    abstract double getCost();
}

class smallPackage extends Package {
    double weightCost = .5;
    public double getCost(){
        return weightCost;
    }
}

class mediumPackage extends Package {
    double weightCost = .75;
    public double getCost(){
        return weightCost;
    }
}

class BigPackage extends Package {
    double weightCost = 1;
    public double getCost(){
        return weightCost;
    }
}

class VeryBigPackage extends Package {
    double weightCost = 1.5;
    public double getCost(){
        return weightCost;
    }
}

public class ShippingCalculator {
    Package mypackage;
    public double calculateShippingCost(Package mypackage, double distance) {
        double cost;
        cost = distance * mypackage.getCost();
    
        return cost;
    }

    public static void main(String[] args){

        ShippingCalculator mySC = new ShippingCalculator();
        smallPackage myPackage1 = new smallPackage();
        mediumPackage myPackage2 = new mediumPackage();
        BigPackage myPackage3 = new BigPackage();
        VeryBigPackage myPackage4 = new VeryBigPackage();
        System.out.println(mySC.calculateShippingCost(myPackage1, 10));
        System.out.println(mySC.calculateShippingCost(myPackage2, 10));
        System.out.println(mySC.calculateShippingCost(myPackage3, 10));
        System.out.println(mySC.calculateShippingCost(myPackage4, 10));
	}
}