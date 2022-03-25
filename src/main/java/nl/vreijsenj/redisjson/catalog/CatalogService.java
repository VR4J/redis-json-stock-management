package nl.vreijsenj.redisjson.catalog;

import lombok.RequiredArgsConstructor;
import nl.vreijsenj.redisjson.stock.StockRepository;
import nl.vreijsenj.redisjson.stock.StockItem;
import org.springframework.data.keyvalue.core.IterableConverter;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class CatalogService {

    private final StockRepository repository;

    public List<StockItem<?>> getAll() {
        return IterableConverter.toList(repository.findAll());
    }
}
