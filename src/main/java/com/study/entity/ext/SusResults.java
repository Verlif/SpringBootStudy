package com.study.entity.ext;

import com.study.entity.JSONBuilder;
import com.study.entity.Results;

import java.util.List;

public class SusResults extends Results {

    public SusResults() {
        build();
    }
    public SusResults(JSONBuilder object) {
        build();
        setData(object);
    }
    public SusResults(List list) {
        build();
        setData(list);
    }
    public SusResults(String name, Object object) {
        put(name, object);
    }

    private void build() {
        setCode("200");
        setMsg("操作成功");
    }
}
