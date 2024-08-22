public abstract class Beverages {
    private boolean wantsExtras;

    public void boilWater(){
        System.out.println("Boiling water");

    }
    public void pourInCup(){
        System.out.println("pouring into cup");

    }

    abstract void brew();

    abstract void addCondiments();
    abstract void addExtras();

    public final void finalTemplateMethod(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
        if(wantsExtras) {
            addExtras();
        }
    }

    public void setWantsExtras(boolean wantsExtras) {
        this.wantsExtras=wantsExtras;

    }
}
