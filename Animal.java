abstract class Animal {
    protected String nameClass;
    protected String name;
    public float max_lengthRun;
    public float max_heightJump;
    public float max_lengthSwim;


    protected boolean isSwim;
    protected boolean isRun;
    protected boolean isJump;


    public Animal(String name) {
        this.name = name;
        this.isSwim = true;
        this.isRun  = true;
        this.isJump = true;
    }

    protected boolean doRun(float real_lengthRun) {return isRun;}
    protected boolean doSwim(float real_lengthSwim) {return isSwim;}
    protected boolean doJump(float real_heightJump) {return isJump;}
    protected String getName(){return name;}


}
