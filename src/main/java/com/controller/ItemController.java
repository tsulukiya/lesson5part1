package com.controller;

import com.model.Item;
import com.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.HttpClientErrorException;

import java.util.Date;

@Controller
public class ItemController {
    private ItemService itemService;

    @Autowired
    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @RequestMapping(method = RequestMethod.POST, value = "saveItem", produces = "application/json")
    public @ResponseBody
    Item save(Item item) {
        try {
            return itemService.save(item);
        } catch (HttpClientErrorException e) {
            System.err.println(e.getStatusCode());

        }
        return null;
    }

    @RequestMapping(method = RequestMethod.PUT, value = "updateItem", produces = "application/json")
    public @ResponseBody
    Item update(Item item) {
        try {
            return itemService.update(item);
        } catch (HttpClientErrorException e) {
            System.err.println(e.getStatusCode());

        }
        return null;
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "updateItem", produces = "application/json")
    public @ResponseBody
    Item delete(Long id) {
        try {
            return itemService.delete(id);
        } catch (HttpClientErrorException e) {
            System.err.println(e.getStatusCode());

        }
        return null;
    }

    @RequestMapping(method = RequestMethod.GET, value = "updateItem", produces = "application/json")
    public @ResponseBody
    Item findById(Long id) {
        try {
            return itemService.findById(id);
        } catch (HttpClientErrorException e) {
            System.err.println(e.getStatusCode());

        }
        return null;
    }
}
