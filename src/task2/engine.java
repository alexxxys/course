package task2;

public class engine {
    int ProductionYear;
    int enginePower;
    boolean ecological = checkEcological();

    public int getProductionYear() {
        return ProductionYear;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public boolean checkEcological() {
        return enginePower > 20000 && ProductionYear > 2000;
    }
}
