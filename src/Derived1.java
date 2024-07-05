class Derived1 extends Base1{
    private int b;
    Derived1(){
        System.out.println("This is a derived class constructor");
    }
    Derived1(int b){
        super(6);
        this.b=b;
        System.out.println("the derived class with argument "+b);
    }
    public int getB(){
        return b;
    }
}