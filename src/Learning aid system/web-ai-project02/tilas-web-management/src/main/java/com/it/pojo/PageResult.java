package com.it.pojo;

import lombok.Data;

import java.util.List;
@Data
public class PageResult<T> {
    private Long total;
    private List<T> rows;

    public PageResult(List<T> rows,long total) {
        this.rows = rows;
        this.total = total;
    }
}
