package com.controller;

import com.model.Item;
import com.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
public class ItemController {
    @Autowired
    private ItemService itemService;

    @RequestMapping(method = RequestMethod.POST, value = "saveItem", produces = "application/json")
    public @ResponseBody Item save(Item item) {
        return itemService.save(item);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "updateItem", produces = "application/json")
    public @ResponseBody Item update(Item item) {
        return itemService.update(item);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "updateItem", produces = "application/json")
    public @ResponseBody Item delete(Long id) {
        return itemService.delete(id);
    }

    @RequestMapping(method = RequestMethod.GET, value = "updateItem", produces = "application/json")
    public @ResponseBody Item findById(Long id) {
        return itemService.findById(id);
    }
}
