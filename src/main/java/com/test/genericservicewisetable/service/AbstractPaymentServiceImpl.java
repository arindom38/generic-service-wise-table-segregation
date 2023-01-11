package com.test.genericservicewisetable.service;

import com.test.genericservicewisetable.entity.AbstractPaymentEntity;
import com.test.genericservicewisetable.repository.AbstractPaymentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public abstract class AbstractPaymentServiceImpl<T extends AbstractPaymentEntity,ID extends Serializable> implements AbstractPaymentService<T,ID>{

    private final AbstractPaymentRepo<T,ID> abstractPaymentRepo;

    @Autowired
    public AbstractPaymentServiceImpl(AbstractPaymentRepo<T, ID> abstractPaymentRepo) {
        this.abstractPaymentRepo = abstractPaymentRepo;
    }

    @Override
    public T save(T entity) {
        return (T) abstractPaymentRepo.save(entity);
    }

    @Override
    public List<T> findAll() {
        return (List<T>) abstractPaymentRepo.findAll();
    }

    @Override
    public Optional<T> findById(ID entityId) {
        return Optional.empty();
    }

    @Override
    public T update(T entity) {
        return null;
    }

    @Override
    public T updateById(T entity, ID entityId) {
        return null;
    }

    @Override
    public void delete(T entity) {

    }

    @Override
    public void deleteById(ID entityId) {

    }

    @Override
    public T findBySubscriptionId(ID subscriptionId) {
        return abstractPaymentRepo.findBySubscriptionId(subscriptionId);
    }

    @Override
    public List<T> findByDueDate(LocalDate dueDate) {
        return findByDueDate(dueDate);
    }

    @Override
    public Optional<T> findBySubscriptionIdAndDueDate(ID subscriptionId, LocalDate dueDate) {
        return abstractPaymentRepo.findBySubscriptionIdAndDueDate(subscriptionId,dueDate);
    }

    @Override
    public Page<T> findAll(Example<T> payment, Pageable p) {
        return abstractPaymentRepo.findAll(payment,p);
    }
}
