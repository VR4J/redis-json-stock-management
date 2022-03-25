package nl.vreijsenj.redisjson.catalog;

import lombok.RequiredArgsConstructor;
import nl.vreijsenj.redisjson.stock.StockItem;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1.0/catalog")
public class CatalogController {

    private final CatalogService service;

    @GetMapping
    public List<StockItem<?>> get() {
        return service.getAll();
    }
}
