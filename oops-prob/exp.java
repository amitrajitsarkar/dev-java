class SmallToBigException extends Exception{
    SmallToBigException(String msg){
        super(msg);
    }
}

class sub{
    int test(int a,int b)throws SmallToBigException{
        if(a<b){
            throw new SmallToBigException("Cannot subtract bigger from smaller");
        }
        return a-b;
    }
}

public class exp {
    public static void main(String[] args) {
        sub s = new sub();
        try{
            System.out.println("Subtraction : "+s.test(200, 30));
        }catch(SmallToBigException e){
            System.out.println(e.getMessage());
        }
    }
    
}
