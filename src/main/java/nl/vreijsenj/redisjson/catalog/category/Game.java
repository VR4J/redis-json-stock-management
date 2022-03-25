package nl.vreijsenj.redisjson.catalog.category;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class Game {

    String title;
    Platform platform;
    Date released;

    public enum Platform {
        PC, PS4, PS5, XBOX_ONE
    }
}


