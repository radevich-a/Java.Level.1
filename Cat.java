public class Cat extends Animal{


    public Cat(String name){
        super(name);
        nameClass = "Кошка";
        max_heightJump = 2.0f;
        max_lengthRun = 200.0f;
        isSwim = false;
    }



    @Override
    protected boolean doRun(float real_lengthRun) {
        if (real_lengthRun > max_lengthRun){
            isRun = false;
        }
        return isRun;
    }

    @Override
    protected boolean doJump(float real_heightJump) {
        if (real_heightJump > max_heightJump){
            isJump = false;
        }
        return isJump;
    }

    @Override
    protected boolean doSwim(float real_lengthSwim) {
        return false;
    }
}
