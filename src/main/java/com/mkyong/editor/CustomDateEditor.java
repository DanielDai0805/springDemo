package com.mkyong.editor;

import java.util.Date;

/**
 * Created by dc on 2015/7/15.
 */
public class CustomDateEditor {
    private Date date;

    @Override
    public String toString() {
        return "CustomDateEditor{" +
                "date=" + date +
                '}';
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
