package nl.vreijsenj.redisjson.stock;

import com.redis.om.spring.annotations.Document;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
@Document
@AllArgsConstructor
public class StockItem<T> {

    @Id
    String id;
    Category category;

    T details;

    double price;
    long stock;

    public enum Category {
        BOOK, GAME
    }
}
