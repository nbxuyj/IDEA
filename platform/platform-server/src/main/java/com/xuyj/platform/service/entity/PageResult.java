package com.xuyj.platform.service.entity;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(value = {"optimizeCountSql", "searchCount",
        "maxLimit", "countId", "orders", "pages"})
public class PageResult<T> extends Page<T> {

    public PageResult() {
        super();
    }

    public PageResult(long current, long size) {
        super(current, size);
    }

    public PageResult(long current, long size, long total) {
        super(current, size, total);
    }

    public PageResult(long current, long size, boolean searchCount) {
        super(current, size, searchCount);
    }

    public PageResult(long current, long size, long total, boolean searchCount) {
        super(current, size, total, searchCount);
    }
}
