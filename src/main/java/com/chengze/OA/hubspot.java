package com.chengze.OA;

import com.chengze.Algrithom.support.Partner;
import com.chengze.Algrithom.support.Result;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class hubspot {
//    public HashMap tryfunction(HashMap<String, Integer> map){
//        HashMap<String, String> map1=new HashMap<>();
//        HashMap<String, Integer> map2= new HashMap<>();
//        int maxdate=0;
//        for(String key: map.keySet()){
//            if(map1.containsKey(key)){
//                map1.put(key, key+map.get(key).toString());
//                map2.put(key+map.get(key).toString(),map2.getOrDefault(key+map.get(key).toString(),0)+1);
//                maxdate=Math.max(maxdate, map.get(key));
//            }
//        }
//        HashMap<String, Integer> res= new HashMap<>();
//        for(String key: map.keySet()){
//            int max=0;
//            for(int i=0; i<maxdate; i++ ){
//                if(map2.containsKey(key+"i")){
//                    int nextdate;
//                    if(!map2.containsKey(key+"i+1")){
//                        nextdate=0;
//                    }else{
//                        nextdate=map2.get(key+"i+1");
//                    }
//                    max=Math.max(max, map2.get(key+"i")+nextdate);
//                }
//            }
//            res.put(key, max);
//        }
//        return res;
//    }

    public List<Result> trytohelp(List<Partner> input) {
        List<Result> res = new LinkedList<>();
        HashMap<String, HashMap<Integer, List<String>>> map1 = new HashMap<>();
//        HashMap<Integer, Integer> map2=new HashMap<>();
        for (int i = 0; i < input.size(); i++) {
            String country = input.get(i).getCountry();
            if (!map1.containsKey(country)) {
                map1.put(country, new HashMap<Integer, List<String>>());
            }
            List<Integer> date = input.get(i).getAvailableDates();
            for (int j = 0; j < date.size(); j++) {
                if (map1.get(country).get(date.get(j)) == null) {
                    map1.get(country).put(date.get(j), new LinkedList<>());
                }
                map1.get(country).get(date.get(j)).add(input.get(i).getEmail());
            }

        }
        for (String key : map1.keySet()) {
            int max = 0;
            int markedtime = 0;
            for (Integer time : map1.get(key).keySet()) {
                if (map1.get(key).get(time + 1) != null) {
                    if (max < map1.get(key).get(time).size() + map1.get(key).get(time + 1).size()) {
                        markedtime = time;
                        max = map1.get(key).get(time).size() + map1.get(key).get(time + 1).size();
                    }
                }
                List<String> resemail = new LinkedList<>();
                List<String> candidemail = new LinkedList<>();
                candidemail = map1.get(key).get(markedtime);
                for (String email : candidemail) {
                    resemail.add(email);
                }
                List<String> candidemail1 = new LinkedList<>();
                for (String email : candidemail1) {
                    resemail.add(email);
                }
                Result resforkey = new Result(max, key, markedtime, resemail);
                res.add(resforkey);
            }
        }
        return res;
    }
    public static void main(String args[]){
        Partner p1=new Partner();
    }
}