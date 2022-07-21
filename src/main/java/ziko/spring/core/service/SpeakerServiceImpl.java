package ziko.spring.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import ziko.spring.core.model.Speaker;
import ziko.spring.core.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository;


    public SpeakerServiceImpl () {
        System.out.println("SpeakerServiceImpl no args constructor");
    }

    // Constructor Injection
    public SpeakerServiceImpl (SpeakerRepository speakerRepository) {
        System.out.println("SpeakerServiceImpl repository constructor");
        repository = speakerRepository;
    }

    @Override
    public List<Speaker> findAll() {
        return repository.findAll();
    }

    // Setter Injection
    @Autowired
    public void setRepository(SpeakerRepository repository) {
        System.out.println("SpeakerServiceImpl setter");
        this.repository = repository;
    }
}
