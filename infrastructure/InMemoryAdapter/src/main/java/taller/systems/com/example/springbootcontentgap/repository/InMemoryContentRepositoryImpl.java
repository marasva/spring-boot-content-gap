package taller.systems.com.example.springbootcontentgap.repository;

import taller.systems.com.example.springbootcontentgap.domain.WikidataEntity;
import taller.systems.com.example.springbootcontentgap.spi.ContentGapRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class InMemoryContentRepositoryImpl implements ContentGapRepository {


    private List<WikidataEntity> inMemoryPages = new ArrayList();


    @Override
    public void addWikidataEntity(WikidataEntity wikidataEntity) {
        this.inMemoryPages.add(wikidataEntity);

    }

    @Override
    public void deleteWikidataEntity(String id) {
        this.inMemoryPages.remove(id);
    }

    @Override
    public List<WikidataEntity> getAllWikidataEntitys() {
        return inMemoryPages;
    }

    @Override
    public Optional<WikidataEntity> findWikidataEntityById(String wikidataEntityId) {
        return inMemoryPages.stream().filter(page ->page.getId().equals(wikidataEntityId)).findFirst();
    }
}
