package com.demo.tipjar.repositories;

import com.demo.tipjar.entities.PaymentHistory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentHistoryRepository extends CrudRepository<PaymentHistory, Long> {
}
