package experiment;

import java.util.*;
class main{
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(1,1);
        map.put(3,2);

        var entry = map.keySet();
        for (var r : entry){
            System.out.println(r);

        }

    }


}


