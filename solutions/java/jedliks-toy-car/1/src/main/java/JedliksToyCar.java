public class JedliksToyCar {
    int battery = 100;
    int metters = 0;
    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return String.format("Driven %s meters", metters);
    }

    public String batteryDisplay() {
        return this.battery > 0 ? String.format("Battery at %s%%", battery) : "Battery empty" ;
    }

    public void drive() {
        if (this.battery > 0)
            this.metters += 20;
            this.battery--;
    }
}
