package taller.systems.com.example.springbootcontentgap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RestController;
import taller.systems.com.example.springbootcontentgap.api.ContentGapService;
import taller.systems.com.example.springbootcontentgap.controller.ContentGapController;
import taller.systems.com.example.springbootcontentgap.domain.WikidataEntity;

import java.util.List;

@RestController
public class ContentGapControllerImpl implements ContentGapController {
    private ContentGapService contentGapService;

    @Autowired
    public ContentGapControllerImpl(ContentGapService contentGapService) {
        this.contentGapService = contentGapService;
    }

    @Override
    public String index() {
        return "Greetings from Content Gap Spring Boot!";
    }

    @Override
    public ResponseEntity<List<WikidataEntity>> getAllWikidataEntitys() {
        return new ResponseEntity<List<WikidataEntity>>(contentGapService.getAllWikidataEntitys(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> createWikidataEntity(WikidataEntity wikidataEntity) {
        contentGapService.createWikidataEntity(wikidataEntity);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> deleteWikidataEntity(String wikidataEntityId) {
        contentGapService.deleteWikidataEntity(wikidataEntityId);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<WikidataEntity> findWikidataEntityById(String wikidataEntityId) {
        return new ResponseEntity<WikidataEntity>((MultiValueMap<String, String>) contentGapService.getAllWikidataEntitys(), HttpStatus.OK);
    }
}
