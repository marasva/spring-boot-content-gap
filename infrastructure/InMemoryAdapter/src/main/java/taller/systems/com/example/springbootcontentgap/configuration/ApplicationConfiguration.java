package taller.systems.com.example.springbootcontentgap.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import taller.systems.com.example.springbootcontentgap.api.ContentGapService;
import taller.systems.com.example.springbootcontentgap.api.ContentGapServiceImpl;
import taller.systems.com.example.springbootcontentgap.repository.InMemoryContentRepositoryImpl;
import taller.systems.com.example.springbootcontentgap.spi.ContentGapRepository;

@Configuration
public class ApplicationConfiguration {

    @Bean
    public ContentGapRepository contentGapRepository(){
        return new InMemoryContentRepositoryImpl();
    }

    @Bean
    public ContentGapService contentGapService(ContentGapRepository contentGapRepository){
        return new ContentGapServiceImpl(contentGapRepository);
    }

}