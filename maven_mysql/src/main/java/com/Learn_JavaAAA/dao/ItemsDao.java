package com.learnCCC.dao;

import com.learnCCC.domain.Items;

import java.util.List;

public interface ItemsDao {
    public List<Items> findAll() throws Exception;
}
