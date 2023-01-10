package com.test.genericservicewisetable.service;

import com.test.genericservicewisetable.entity.AbstractPaymentEntity;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;


public interface AbstractPaymentService<T extends AbstractPaymentEntity, ID extends Serializable> {
    T save(T entity);
    List<T> findAll(); // you might want a generic Collection if u prefer

    Optional<T> findById(ID entityId);
    T update(T entity);
    T updateById(T entity, ID entityId);
    void delete(T entity);
    void deleteById(ID entityId);

    T findBySubscriptionId(ID subscriptionId);

    List<T> findByDueDate(LocalDate dueDate);

    Optional<T> findBySubscriptionIdAndDueDate(ID subscriptionId, LocalDate dueDate);

    Page<T> findAll(Example<T> payment, Pageable p);

}
