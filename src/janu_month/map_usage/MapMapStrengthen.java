package janu_month.map_usage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// FIXME: 2021/1/22 在MapMap上稍微改动一下
public class MapMapStrengthen {
    public static void main(String[] args) {
        Map<String,Integer> map = getMapMap();
        List<String>  list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        for (String code : list) {
            Integer flow = map.get(code);
            if(flow == null){
                flow = 0;
            }
            System.out.println("出口："+code+" 流量"+flow);
        }
    }

    private static Map<String, Integer> getMapMap() {
        Map<String,Integer> map = new HashMap<>();
        map.put("A",1);
        map.put("B",2);
        return map;
    }

}
