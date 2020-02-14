package com.service;

import com.model.Item;

public interface ItemService {
    Item save(Item item);

    Item update(Item item);

    Item delete(Long id);

    Item findById(Long id);
}
