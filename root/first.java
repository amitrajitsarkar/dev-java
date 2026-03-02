import java.util.Random;

public class first {
    public static void main(String[] args) {
        Random random = new Random();
        
        // Generate random numbers
        int randomInt = random.nextInt(100);
        double randomDouble = random.nextDouble();
        
        System.out.println("Random Integer (0-99): " + randomInt);
        System.out.println("Random Double (0.0-1.0): " + randomDouble);
        
        // Simple calculation
        int result = randomInt * 2;
        System.out.println("Random number multiplied by 2: " + result);
    }
}