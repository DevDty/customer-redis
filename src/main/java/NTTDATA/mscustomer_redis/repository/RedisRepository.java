package NTTDATA.mscustomer_redis.repository;

import NTTDATA.mscustomer_redis.domain.Customer;

import java.util.Map;

public interface RedisRepository {
    Map<String, Customer> findAll();
    Customer findById(String id);
    void save(Customer customer);
    void delete(String id);
}
