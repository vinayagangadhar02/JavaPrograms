public class Shadowing {
    private int x=20;

    public int getX() {
        int x=30;
        change();
        return x;
    }
    public int change(){
        return x;
    }
}
