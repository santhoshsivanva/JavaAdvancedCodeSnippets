package Autoboxing;

public class autoboxing {
    
    public static void main(String[] args) {
        // Sometimes we need to convert int to Integer data type, so we can use autoboxing.
        // Autoboxing converts a primitive to an object.
        // Unboxing converts an object to a primitive.
        // We can also convert a String to an int using Integer.valueOf().

        String str = "12";
        System.out.println(Integer.valueOf(str));
        
        int i = 12;
        Integer j = i;
        int k = j;

        System.out.println(k);
    }
} 
