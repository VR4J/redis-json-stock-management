package nl.vreijsenj.redisjson.stock;

import com.redis.om.spring.ops.json.JSONOperations;
import com.redislabs.modules.rejson.Path;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class StockService {

    private final JSONOperations<String> ops;

    public synchronized void pick(String id, long count) {
        Long current = ops.get(getKey(id), long.class, Path.of("stock"));

        assert current != null;

        if(current < count) {
            throw new OutOfStockException(
                    String.format("Cannot pick item [%s] as there is not enough stock (%s) available for the requested amount of %s.", id, current, count)
            );
        }

        ops.set(getKey(id), current - count, Path.of("stock"));
    }

    private String getKey(String id) {
        return String.format("nl.vreijsenj.redisjson.stock.StockItem:%s", id);
    }
}
