package ziko.spring.core.service;

import ziko.spring.core.model.Speaker;
import ziko.spring.core.repository.HibernateSpeakerRepositoryImpl;
import ziko.spring.core.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository;

    // Constructor Injection
    public SpeakerServiceImpl (SpeakerRepository speakerRepository) {
        repository = speakerRepository;
    }

    @Override
    public List<Speaker> findAll() {
        return repository.findAll();
    }

    // Setter Injection
    public void setRepository(SpeakerRepository repository) {
        this.repository = repository;
    }
}
