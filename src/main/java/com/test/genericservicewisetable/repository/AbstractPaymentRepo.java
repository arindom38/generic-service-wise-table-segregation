package com.test.genericservicewisetable.repository;

import com.test.genericservicewisetable.entity.AbstractPaymentEntity;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@NoRepositoryBean
public interface AbstractPaymentRepo<T extends AbstractPaymentEntity,ID extends Serializable> extends PagingAndSortingRepository<T, ID> {

    T findBySubscriptionId(ID subscriptionId);

    List<T> findByDueDate(LocalDate dueDate);

    Optional<T> findBySubscriptionIdAndDueDate(ID subscriptionId, LocalDate dueDate);

    Page<T> findAll(Example<T> payment, Pageable p);
}
