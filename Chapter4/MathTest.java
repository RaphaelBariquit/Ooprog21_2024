public class MathTest {
    public static void main(String[] args) {
        double number = 37.5;
        
         double sqrt = Math.sqrt(number);
        System.out.println("SQRT: " + sqrt);
        
        
        double angle = Math.toRadians(45); 
        double sinValue = Math.sin(angle);
        double cosValue = Math.cos(angle);
        System.out.println("SIN: " + sinValue);
        System.out.println("COS: " + cosValue);
        
        
        double floorValue = Math.floor(number);
        double ceilValue = Math.ceil(number);
        System.out.println("FLOOR: " + floorValue);
        System.out.println("CEIL: " + ceilValue);
        
      
        long roundValue = Math.round(number);
        System.out.println("ROUND: " + roundValue);
        
       
        int maxValue = Math.max(71, 68);
        int minValue = Math.min(71, 68);
        System.out.println("MAX: " + maxValue);
        System.out.println("MIN: " + minValue);
        
      
        double randomValue = Math.random() * 100; 
         System.out.println("RANDOM: " + randomValue);
    }
}
