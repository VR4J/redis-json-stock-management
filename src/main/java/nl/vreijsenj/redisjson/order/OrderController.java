package nl.vreijsenj.redisjson.order;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1.0/orders")
public class OrderController {

    private final OrderService service;

    @PostMapping
    public Order place(@RequestBody Order order) {
        return service.process(order);
    }
}
