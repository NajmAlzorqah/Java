
package first.app;

import java.util.ArrayList;

public class FirstApp {
    public static void main(String[] args) {
          
        ArrayList numbers = new ArrayList() ;
        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        System.out.println(numbers.get(0));
        System.out.println(numbers.get(1));
        System.out.println(numbers.get(2));
        for (int i = 0; i < numbers.size(); i++) {
            Object get = numbers.get(i);
            
        }
    }
    
}
