package Main_package;

public class Tree_Characteristics {

    Mango obj;
    Jakfruit objJak;
    Mahogony objMahogony;
    Neem objNeem;
    WoodTree objWood;

    public void mango_characteristics() {
        this.obj = new Mango();
        System.out.println("---------------------------");
        this.obj.mangoCharacteristics();
         System.out.println("---------------------------");
    }
    public void jackfruit_characteristics() {
        this.objJak = new Jakfruit();
        System.out.println("---------------------------");
        this.objJak.jackfruitCharacteristics();
         System.out.println("---------------------------");
    }
    public void mahogony_characteristics() {
        this.objMahogony = new Mahogony();
        System.out.println("---------------------------");
        this.objMahogony.mahogonyCharacteristics();
         System.out.println("---------------------------");
    }
    public void neem_characteristics() {
        this.objNeem = new Neem();
        System.out.println("---------------------------");
        this.objNeem.neemCharacteristics();
         System.out.println("---------------------------");
    }
    public void wood_characteristics() {
        this.objWood = new WoodTree();
        System.out.println("---------------------------");
        this.objWood.woodCharacteristics();
         System.out.println("---------------------------");
    }

}
