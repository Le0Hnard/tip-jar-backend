package com.demo.tipjar.repositories;

import com.demo.tipjar.entities.PaymentHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PaymentHistoryRepository extends JpaRepository<PaymentHistory, Long> {

    List<PaymentHistory> findAllByOrderByIdDesc(); // can use findFirstByOrderByIdDesc();

}
