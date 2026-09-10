class trial{
    int times;
    trial(int x){
        times = x;
    }

    void task(){
        System.out.println("hello"+" "+times);
    }
}


public class hello{
    public static void main(String args[]){
        trial t = new trial(199);
        t.task();   
    }
}