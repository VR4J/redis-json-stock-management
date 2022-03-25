package nl.vreijsenj.redisjson.catalog;

import lombok.RequiredArgsConstructor;
import nl.vreijsenj.redisjson.catalog.category.Book;
import nl.vreijsenj.redisjson.catalog.category.Game;
import nl.vreijsenj.redisjson.stock.StockRepository;
import nl.vreijsenj.redisjson.stock.StockItem;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.util.Date;

@Component
@RequiredArgsConstructor
public class CatalogSeeder {

    private final StockRepository repository;

    @EventListener
    public void seed(ContextRefreshedEvent event) {
        repository.deleteAll();

        // 2016-05-10
        Instant released = Instant.ofEpochSecond(1462838400);
        Game uncharted = new Game("Uncharted 4: A Thief's End", Game.Platform.PS4, Date.from(released));

        // 2015-07-01
        Instant published = Instant.ofEpochSecond(1435708800);
        Book dune = new Book("9780340960196", "Dune", "Hubert, Frank", Date.from(published));

        StockItem<Game> game = new StockItem<>(null, StockItem.Category.GAME, uncharted, 21.74, 10);
        StockItem<Book> book = new StockItem<>(null, StockItem.Category.BOOK, dune, 11.99, 10);

        repository.save(game);
        repository.save(book);
    }
}
