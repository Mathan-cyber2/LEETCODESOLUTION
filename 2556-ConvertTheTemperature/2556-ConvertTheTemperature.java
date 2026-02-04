// Last updated: 2/4/2026, 3:32:22 PM
class Solution {
    public double[] convertTemperature(double celsius) {
        double kelvin = celsius + 273.15;
        double fahrenheit = celsius * 1.80 + 32.00;
        return new double[] {kelvin, fahrenheit};
    }
}