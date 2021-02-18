package janu_month.map_usage;

import java.util.*;

/**
 * map字典用法
 * map集合，可以多次put
 * 就像list集合，可以多次add
 */
// FIXME: 2021/1/22 Ctrl+j（牢记这个快捷键）在idea中
public class MapMap {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("A",1);
        map.put("B",2);
        map.put("C",3);
        List<String> outList = new ArrayList<>();
        outList.add("A");
        outList.add("B");
        outList.add("C");
        outList.add("D");
        Map<String,Integer> sortFlow = new HashMap<>();
        for (String s : outList) {//todo 增强for循环，用iter快速生成
            Integer flow = map.get(s);
            if(flow == null){
                flow = 0;
            }
            System.out.println("出口："+s+" 流量："+flow);
            sortFlow.put(s,flow);
        }
        List<Map.Entry<String,Integer>> list = new ArrayList<Map.Entry<String,Integer>>(sortFlow.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        for (Map.Entry<String, Integer> mapping : list){
            System.out.println(mapping.getKey() + ":" + mapping.getValue());
        }

    }
}




