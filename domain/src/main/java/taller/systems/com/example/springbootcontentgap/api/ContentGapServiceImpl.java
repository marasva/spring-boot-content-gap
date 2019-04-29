package taller.systems.com.example.springbootcontentgap.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import taller.systems.com.example.springbootcontentgap.domain.WikidataEntity;
import taller.systems.com.example.springbootcontentgap.spi.ContentGapRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ContentGapServiceImpl implements ContentGapService {

    private ContentGapRepository contentGapRepository;

    @Autowired
    public ContentGapServiceImpl(ContentGapRepository contentGapRepository) {
        this.contentGapRepository = contentGapRepository;
    }


    @Override
    public void createWikidataEntity(WikidataEntity wikidataEntity) {
        // todo: add Exceptions
        contentGapRepository.addWikidataEntity(wikidataEntity);
    }

    @Override
    public void deleteWikidataEntity(String wikiId) {
        // todo: add Exceptions
        Optional<WikidataEntity> wikidataEntityById = findWikidataEntityById(wikiId);
        contentGapRepository.deleteWikidataEntity(wikidataEntityById.get().getId());
    }

    @Override
    public List<WikidataEntity> getAllWikidataEntitys() {
        return contentGapRepository.getAllWikidataEntitys();
    }

    @Override
    public Optional<WikidataEntity> findWikidataEntityById(String wikidataEntityId) {
        return contentGapRepository.findWikidataEntityById(wikidataEntityId);
    }


}
