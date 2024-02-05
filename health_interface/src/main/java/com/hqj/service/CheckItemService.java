package com.hqj.service;

import com.hqj.entity.PageResult;
import com.hqj.pojo.CheckItem;
import java.util.List;
/**
 * 检查项服务接口
 */
public interface CheckItemService {

    public void add(CheckItem checkItem);

    public PageResult findPage(Integer currentPage,Integer pageSize, String queryString);

    public void delete(Integer id);

    public void edit(CheckItem checkItem);

    public CheckItem findById(Integer id);
}
