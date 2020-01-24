package Main_package;

public class Mahogony extends Tree {

    private final String mainOrigin = "Sundarban Forest";
    private int fruitGivingCyclePerYEar = 0;

    Mahogony() {
        isMangrove = true;
        userTreeName = "Mahogony" + (int) (Math.random() * 50 + 1);
    }

    public void mahogonyInfo() {
        super.showInfo();
        mahogonyCharacteristics();
    }

    public void mahogonyCharacteristics() {
        fruitStatus();
        System.out.println("Mahogony fruit is an excellent source of Wood.");
        System.out.println("Mahogony leaves can be used for cure followings > Vascular Dieseases etc");
        System.out.println("Mahogony fruit can make a profitable Business");
        System.out.println("Mahogony tree is good for plant Bangladesh Sundarban");
        healthBenefits();
        refreshAir();
        System.out.println("Main origin of this tree is from: " + mainOrigin);
        System.out.println("Fruit per year is : " + fruitGivingCyclePerYEar);

    }

    @Override
    void fruitStatus() {
        isSeasonalFruit = false;
        System.out.println("The Mahogony fruit is seasonal? " + isSeasonalFruit);
        System.out.println("This tree doesn't produce any fruit");
    }

    void healthBenefits() {
        System.out.println("Common Health benefits: Diuabetes, Lack of appetite, Eczema etc.");
    }
}
