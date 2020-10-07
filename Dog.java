public class Dog extends Animal{

    public Dog(String name) {
        super(name);
        nameClass = "Собака";
        max_heightJump = 0.5f;
        max_lengthRun = 500.0f;
        max_lengthSwim = 10.0f;
    }



    @Override
    protected boolean doRun(float real_lengthRun) {
        if (real_lengthRun > max_lengthRun){
            isRun = false;

        }
        return isRun;
    }

    @Override
    protected boolean doSwim(float real_lengthSwim) {
        if (real_lengthSwim > max_lengthSwim) {
            isSwim = false;
        }
        return isSwim;
    }

    @Override
    protected boolean doJump(float real_heightJump) {
        if (real_heightJump > max_heightJump){
            isJump = false;
        }
        return isJump;
    }
}
