package nl.vreijsenj.redisjson.catalog.category;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;


@Data
@AllArgsConstructor
public class Book {

    String ean;
    String title;
    String author;
    Date published;
}
