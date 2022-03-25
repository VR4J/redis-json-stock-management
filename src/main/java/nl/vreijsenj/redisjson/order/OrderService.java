package nl.vreijsenj.redisjson.order;

import lombok.RequiredArgsConstructor;
import nl.vreijsenj.redisjson.stock.StockService;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class OrderService {

    private final StockService stock;

    public Order process(Order order) {
        order.getLines().forEach(line ->
            stock.pick(line.getStockItemId(), line.getCount())
        );

        return order;
    }
}
