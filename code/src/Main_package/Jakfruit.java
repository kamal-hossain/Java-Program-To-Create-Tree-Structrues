package Main_package;

public class Jakfruit extends Tree {
    private final String mainOrigin  = "Sundarban Forest";
    private int fruitGivingCyclePerYEar = 1;
    
    Jakfruit() {
        userTreeName = "Jakfruit" + (int) (Math.random() * 50 + 1);
        isMangrove = false;
    }

    public void jakfruitInfo() {
        super.showInfo();
        jackfruitCharacteristics();
    }

    public void jackfruitCharacteristics() {
        fruitStatus();
        System.out.println("Jackfruit fruit is an excellent source of dietary fiber and vitamin C.");
        System.out.println("Jackfruit leaves can be used for cure followings > Animal food");
        System.out.println("Jackfruit tree is good for plant Bangladesh All rural place");
        System.out.println("Jackfruit fruit can make a profitable business on its season");
        healthBenefits();
        refreshAir();
         System.out.println("Main origin of this tree is from: " + mainOrigin);
        System.out.println("Fruit per year is : " + fruitGivingCyclePerYEar);
    }

    @Override
    void fruitStatus() {
        isSeasonalFruit = true;
        System.out.println("The Jackfruit is seasonal? " + isSeasonalFruit);
    }

    @Override
    void healthBenefits() {
        System.out.println("Common Health benefits: Fights wrinkles, Flawless skin,Immunity etc.");
    }

}
