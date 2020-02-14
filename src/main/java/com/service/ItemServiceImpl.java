package com.service;

import com.model.Item;
import com.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements ItemService {
    private ItemRepository itemRepository;

    @Autowired
    public ItemServiceImpl(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Override
    public Item save(Item item) {
        return itemRepository.save(item);
    }

    @Override
    public Item update(Item item) {
        return itemRepository.update(item);
    }

    @Override
    public Item delete(Long id) {
        return itemRepository.delete(id);
    }

    @Override
    public Item findById(Long id) {
        return itemRepository.findById(id);
    }
}
