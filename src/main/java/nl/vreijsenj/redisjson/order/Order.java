package nl.vreijsenj.redisjson.order;

import lombok.Data;
import nl.vreijsenj.redisjson.user.User;

import java.util.List;

@Data
public class Order {

    User customer;
    List<OrderLine> lines;
}
