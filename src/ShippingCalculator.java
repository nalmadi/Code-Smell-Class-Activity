

public class ShippingCalculator {
    public double calculateShippingCost(double weight, double distance) {
        double cost;
        private static final double WEIGHT_UNDER_FIVE = 0.50
        private static final double WEIGHT_UNDER_TEN = 0.75
        private static final double WEIGHT_UNDER_TWENTY = 1.00
        private static final double WEIGHT_OVER_TWENTY = 1.50


        if (weight <= 5) {
            cost = distance * WEIGHT_UNDER_FIVE; // $0.50 per mile for weights up to 5 lbs
        } else if (weight <= 10) {
            cost = distance * WEIGHT_UNDER_TEN; // $0.75 per mile for weights up to 10 lbs
        } else if (weight <= 20) {
            cost = distance * WEIGHT_UNDER_TWENTY; // $1.00 per mile for weights up to 20 lbs
        } else {
            cost = distance * WEIGHT_OVER_TWENTY; // $1.50 per mile for weights over 20 lbs
        }

        return cost;
    }
}


//Magic Numbers
