package taller.systems.com.example.springbootcontentgap.api;

import taller.systems.com.example.springbootcontentgap.domain.WikidataEntity;

import java.util.List;
import java.util.Optional;

public interface ContentGapService {


    void createWikidataEntity(WikidataEntity wikidataEntity);
    void deleteWikidataEntity(String id);
    List<WikidataEntity> getAllWikidataEntitys();
    Optional<WikidataEntity> findWikidataEntityById(String wikidataEntityId);

}
