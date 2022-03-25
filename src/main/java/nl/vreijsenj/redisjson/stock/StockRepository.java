package nl.vreijsenj.redisjson.stock;

import com.redis.om.spring.repository.RedisDocumentRepository;

public interface StockRepository extends RedisDocumentRepository<StockItem<?>, String> {

}
