package builder;

import java.util.HashMap;
import java.util.Map;

public class Client {

    public static void main(String[] args) {
        // Food =
      countDistinctSubString("FOOD");
// bag = ""

    }
    private static void countDistinctSubString(String s){
        int n = s.length();
        Map<String,Integer> map = new HashMap<>();
        String bag;
        int sum = 0;
        int count;
        // String - stream - forEach()- distinctCount(String string)- sum :
        for(int i=0;i<n ; i++){
            count=0;
             bag = "";
            for(int j=i+1;j<n;j++){
                bag = s.substring(i,j);
                count++;
            }
           // System.out.println(bag);
            map.put(bag,count);
            sum +=count;
        }
        System.out.println(sum);
        // employee - e.name  = duplicate - delete duplicates
        /*
        * select name, id from employee;
        *
        * DELETE name FROM employee as e WHERE e1.name = e2.name;
        *
        *
        *
        *
        *
        * */

    }
}
