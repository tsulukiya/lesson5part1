package com.repository;

import com.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Repository
@Transactional
public class ItemRepositoryImpl implements ItemRepository {
    @PersistenceContext
    private EntityManager entityManager;
    private static final String sqlQueryFindById = "from Item where id =:code";

    @Override
    public Item save(Item item) {
        entityManager.persist(item);
        return item;
    }

    @Override
    public Item update(Item item) {
        entityManager.merge(item);
        return item;
    }

    @Override
    public Item delete(Long id) {
        Item item = findById(id);
        entityManager.detach(item);
        return item;
    }

    @Override
    public Item findById(Long id) {
        Query query = entityManager.createQuery(sqlQueryFindById);
        query.setParameter("code", id);
        Item item = (Item) query.getSingleResult();
        return item;
    }
}
