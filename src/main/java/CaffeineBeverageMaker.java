public class CaffeineBeverageMaker {
    private CaffeineBeverage beverage;

    public CaffeineBeverageMaker(CaffeineBeverage beverage) {
        this.beverage = beverage;
    }

    public void prepareRecipe() {
        this.boilWater();
        beverage.brew();
        this.pourInCup();
        beverage.addCondiments();
    }

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }

    private void boilWater() {
        System.out.println("Boiling Water");
    }
}
