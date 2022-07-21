package ziko.spring.core.repository;

import ziko.spring.core.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    @Override
    public List<Speaker> findAll() {
        List<Speaker> speakers = new ArrayList<Speaker>();

        Speaker speaker = new Speaker();

        speaker.setFirstName("Zakaria");
        speaker.setLastName("Jouahri");

        speakers.add(speaker);

        return speakers;
    }
}
