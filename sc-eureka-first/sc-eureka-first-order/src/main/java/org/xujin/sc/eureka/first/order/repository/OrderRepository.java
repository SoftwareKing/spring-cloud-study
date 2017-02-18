package org.xujin.sc.eureka.first.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.xujin.sc.eureka.first.order.entity.Order;

/**
 * 
 * @author xujin
 *
 */
@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
