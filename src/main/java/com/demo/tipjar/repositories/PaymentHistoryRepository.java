package com.demo.tipjar.repositories;

import com.demo.tipjar.entities.PaymentHistory;
import org.springframework.data.repository.CrudRepository;

public interface PaymentHistoryRepository extends CrudRepository<PaymentHistory, Long> {
}
