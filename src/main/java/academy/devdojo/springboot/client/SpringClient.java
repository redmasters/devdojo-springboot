package academy.devdojo.springboot.client;

import academy.devdojo.springboot.domain.Anime;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@Log4j2
public class SpringClient {
    public static void main(String[] args) {
        ResponseEntity<Anime> entity = new RestTemplate()
                .getForEntity("http://localhost:8082/animes/{id}", Anime.class, 2);
        log.info(entity);

        Anime object = new RestTemplate().getForObject("http://localhost:8082/animes/{id}", Anime.class,  2);
        log.info(object);


    }

}