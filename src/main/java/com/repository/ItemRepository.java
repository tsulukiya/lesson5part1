package com.repository;

import com.model.Item;

public interface ItemRepository {
    Item save(Item item);

    Item update(Item item);

    Item delete(Long id);

    Item findById(Long id);
}
