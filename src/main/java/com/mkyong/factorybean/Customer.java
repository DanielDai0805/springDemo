package com.mkyong.factorybean;

import java.util.List;

/**
 * Created by dc on 2015/7/15.
 */
public class Customer {
    private List list;

    public List getList() {
        return list;
    }

    public void setList(List list) {

        this.list = list;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "list=" + list +
                '}';
    }
}
