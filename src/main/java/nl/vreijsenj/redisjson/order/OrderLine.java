package nl.vreijsenj.redisjson.order;

import lombok.Data;

@Data
public class OrderLine {

    String stockItemId;
    long count;
}
