class Lasagna
{
    const int ExpectedMinutes = 40;
    const int Layer = 2;
    
    public int ExpectedMinutesInOven() => ExpectedMinutes;
    
    public int RemainingMinutesInOven(int minutes) => ExpectedMinutesInOven() - minutes;
    
    public int PreparationTimeInMinutes(int layers) => Layer * layers;
    
    public int ElapsedTimeInMinutes(int layers, int minutes) => PreparationTimeInMinutes(layers) + minutes;
}
