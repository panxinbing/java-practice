package org.example.advanceOperation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SetInit {
    public static void main(String[] args) {
      listInit();
      mapInit();
    }


    /**
     * init list.
     */
    public static void listInit(){
        List<String> list = new ArrayList<String>(){{
            add("111");
            add("222");
            add("333");
        }};
        System.out.println(list.toString());
    }

    /**
     * init map.
     */
    public static void mapInit(){
        Map<String,String> map = new HashMap<String,String>(){{
            put("1","1");
            put("2","2");
        }};
        System.out.println(map.toString());
    }




}
