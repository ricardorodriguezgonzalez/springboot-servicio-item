package com.formacion.app.item.service;

import com.formacion.app.item.models.Item;

import java.util.List;

public interface ItemService {
    List<Item> findAll();
    Item findById(Long id, Integer cantidad);
}
