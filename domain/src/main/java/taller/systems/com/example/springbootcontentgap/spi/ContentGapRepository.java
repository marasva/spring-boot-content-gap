package taller.systems.com.example.springbootcontentgap.spi;

import taller.systems.com.example.springbootcontentgap.domain.WikidataEntity;

import java.util.List;
import java.util.Optional;

public interface ContentGapRepository {

    void addWikidataEntity(WikidataEntity wikidataEntity);

    void deleteWikidataEntity(String id);

    List<WikidataEntity> getAllWikidataEntitys();

    Optional<WikidataEntity> findWikidataEntityById(String wikidataEntityId);

}
