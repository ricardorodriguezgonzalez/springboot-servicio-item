package com.formacion.app.item.controllers;

import com.formacion.app.item.models.Item;
import com.formacion.app.item.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemController {
    @Autowired
    private ItemService itemService;

    @GetMapping("/listar")
    public List<Item> listar(){
        return itemService.findAll();
    }
    @GetMapping("/ver/{id}/cantidad/{cantidad}")
    public Item detalle(@PathVariable Long id, @PathVariable Integer cantidad){
        return itemService.findById(id, cantidad);
    }
}
