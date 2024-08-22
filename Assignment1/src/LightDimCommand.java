public class LightDimCommand implements Command{

  private Light light;
  private int oldBrightness;
  private int newBrightness;



    public LightDimCommand(Light light,int level)
    {this.light=light;
        this.newBrightness=level;
    }

    @Override
    public void execute(){
        oldBrightness=100;
        light.dim(newBrightness);

    }
    @Override
    public void undo(){
        light.dim(oldBrightness);

    }
}
