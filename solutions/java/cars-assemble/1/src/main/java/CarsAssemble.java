public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        int CARS = 221;
        double value = 0.0;
        if (speed <= 4) {
            value = speed * CARS;
        } else if (speed > 4 && speed <= 8) {
            value = speed * CARS * 0.9;
        } else if (speed > 8 && speed <= 9) {
            value = speed * CARS * 0.8;
        } else {
            value = speed * CARS * 0.77;
        }
        return value;
    }

    public int workingItemsPerMinute(int speed) {
        int CARS = 221;
        double producedByMinute = CARS / 0.6 * speed / 100;
        double value = 0.0;
        if (speed <= 4) {
            value = producedByMinute;
        } else if (speed > 4 && speed <= 8) {
            value = producedByMinute * 0.9;
        } else if (speed > 8 && speed <= 9) {
            value = producedByMinute * 0.8;
        } else {
            value = producedByMinute * 0.77;
        }
        return (int)value;
    }
}
