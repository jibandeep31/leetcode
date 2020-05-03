package com.jiban.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DestinationCity {
    
    public static void main(String[] args) {
        List<List<String>> paths = new ArrayList();
        paths.add(Arrays.asList("London", "New York"));
        paths.add(Arrays.asList("New York", "Lima"));
        paths.add(Arrays.asList("Lima", "Sao Paulo"));
        
        System.out.println(destCity(paths));
    }
    
    public static String destCity(List<List<String>> paths) {
        String destination = null;
        Map<String, String> cityMap = new HashMap();
        for(List path : paths) {
            cityMap.put(path.get(0).toString(), path.get(1).toString());
        }
        
        Set<String> keys = cityMap.keySet();
        for(String key : keys) {
            if(cityMap.get(key) == null)
                destination =  key;
        }
        return destination;
    }

}
