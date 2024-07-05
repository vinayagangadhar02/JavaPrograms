
class Thread6 extends Thread{
    public Thread6(String name){
        super(name);
    }
    public void run(){
        while(true){
            System.out.println(this.getName());
        }
    }
}