package taller.systems.com.example.springbootcontentgap.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import taller.systems.com.example.springbootcontentgap.domain.WikidataEntity;

import java.util.List;

public interface ContentGapController {
    @GetMapping("/hello")
    String index();


    @GetMapping("/wikidataEntity")
    ResponseEntity<List<WikidataEntity>> getAllWikidataEntitys();

    /*
    @RequestMapping(value = "/wikidataEntity", method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    ResponseEntity<Void> createWikidataEntity(@RequestBody WikidataEntity wikidataEntity);
*/

    @PostMapping("/wikidataEntity")
    ResponseEntity<Void> createWikidataEntity(@RequestParam(required = false) WikidataEntity wikidataEntity);

    @DeleteMapping("/wikidataEntity")
    ResponseEntity<Void> deleteWikidataEntity(@PathVariable String wikidataEntityId);

    @GetMapping("/wikidataEntity/{productId}")
    ResponseEntity<WikidataEntity> findWikidataEntityById(@PathVariable String wikidataEntityId);

}
