package task3;

public class engine {
    private int ProductionYear;
    private int enginePower;
    private boolean ecological = checkEcological();

    public int getProductionYear() {
        return ProductionYear;
    }

    public int getEnginePower() {
        return enginePower;
    }

    protected boolean checkEcological() {
        return enginePower > 20000 && ProductionYear > 2000;
    }
}
