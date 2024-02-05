package com.hqj.dao;

import com.github.pagehelper.Page;
import com.hqj.pojo.CheckItem;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 持久层Dao接口
 */
public interface CheckItemDao {
    void add(CheckItem checkItem);

    Page<CheckItem> selectByCondition(String value);

    long findCountByCheckItemId(Integer id);

    void deleteById(Integer checkItemId);

    void edit(CheckItem checkItem);

    CheckItem findById(Integer id);
}
