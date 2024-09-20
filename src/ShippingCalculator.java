public class ShippingCalculator {
    public double calculateShippingCost(double weight, double distance) {
        double cost;

        if (weight <= 5) {
            cost = distance * 0.50; // $0.50 per mile for weights up to 5 lbs
        } else if (weight <= 10) {
            cost = distance * 0.75; // $0.75 per mile for weights up to 10 lbs
        } else if (weight <= 20) {
            cost = distance * 1.00; // $1.00 per mile for weights up to 20 lbs
        } else {
            cost = distance * 1.50; // $1.50 per mile for weights over 20 lbs
        }

        return cost;
    }
}
