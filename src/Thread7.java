class Thread7 extends Thread{
    public void run()  {
        while(true){
            System.out.println("Heyyy guys");
            try{
                Thread.sleep(500);
            }
            catch(Exception e){
                e.printStackTrace();
            }

        }
    }
}