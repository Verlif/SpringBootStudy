package com.study.test;

import com.study.entity.Patent;
import com.study.entity.Reference;
import com.study.entity.Results;
import com.study.entity.ext.FailResults;
import com.study.entity.ext.SusResults;

import java.util.ArrayList;
import java.util.List;

public class JSONtest {

    public static void main (String[] args) {
        List<Reference> list = new ArrayList<>();
        list.add(new Reference());
        list.add(new Reference());
        list.add(new Reference());
        Results results = new Results();
        results.setData(list);
        System.out.println(results.toString());
        System.out.println(new SusResults());
        System.out.println(new SusResults(new Patent()));
        System.out.println(new SusResults(list));
        System.out.println(new FailResults("未能查找到数据"));
    }
}
