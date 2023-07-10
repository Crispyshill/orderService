package com.transcendenttopicals.orderService;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderDAO extends MongoRepository<Order, String>{

}
