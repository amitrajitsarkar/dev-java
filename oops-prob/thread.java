class T1 extends Thread{
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("T1 : "+i);
        }
    }
}

class T2 extends Thread{
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("T2 : "+i);
            if(i == 6){
                try{
                    Thread.sleep(1000);
                }catch(Exception e){
                    System.out.println("Exception found" +e.getMessage());
                }
            }
        }
    }
}

public class thread {
    public static void main(String[] args) {
        T1 t1 =new T1();
        t1.run();

        T2 t2 = new T2();
        t2.run();
    }
}
