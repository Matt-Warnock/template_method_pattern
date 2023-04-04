public class Cafe {
    public static void main(String[] args) {
        CaffeineBeverage tea = new Tea();
        CaffeineBeverage coffee = new Coffee();
        CaffeineBeverageMaker teaMaker = new CaffeineBeverageMaker(tea);
        CaffeineBeverageMaker coffeeMaker = new CaffeineBeverageMaker(coffee);
        teaMaker.prepareRecipe();
        coffeeMaker.prepareRecipe();
    }
}
