public class LivingRoomLight implements Light{
    private int brightness=100;


    @Override
    public void on(){
        brightness=100;
        System.out.println("Living Room light is ON at full brightness.");

    }
    @Override
        public void off(){

        System.out.println("Living Room light is OFF.");

    }
    @Override
    public void dim(int level){
        brightness=level;
        System.out.println("Living Room light dimmed to "+level+"%.");

    }

    @Override
    public void brightness() {

    }

}
