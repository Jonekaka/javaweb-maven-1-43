package com.learnCCC.test;

import com.learnCCC.dao.ItemsDao;
import com.learnCCC.dao.impl.ItemsDaoImpl;
import com.learnCCC.domain.Items;
import org.junit.Test;

import java.util.List;

public class ItemsTest {
    @Test
    public void findAll() throws  Exception{
        ItemsDao itemsDao = new ItemsDaoImpl();
        List<Items> list = itemsDao.findAll();
        for (Items items : list) {
            System.out.println(items.getName());
        }
    }
}
