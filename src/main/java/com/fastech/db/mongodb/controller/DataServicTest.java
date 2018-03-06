package com.fastech.db.mongodb.controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by mystoxlol on 2017/7/12, 19:40.
 * company: fastech
 * update record:
 */
@RestController
public class DataServicTest
{


    @RequestMapping(value = "/testUI")
    public ModelMap test(@RequestHeader("ServiceCode") String serviceCode)
    {
        System.out.println(serviceCode);
        ModelMap map = new ModelMap();



        Map<String,Object> mapall= /*mapall = (Map<String, Object>) PropertyLoader.memoryDataR.get("1");*/
        new HashMap<>();
        mapall.put("titleList","123");
        if(mapall != null) {
            map.put("title", mapall.get("titleList"));
            map.put("addList", mapall.get("addList"));
            map.put("deleteList", mapall.get("deleteList"));
            map.put("totalList", mapall.get("totalList"));
        }
        return map;
    }
}
