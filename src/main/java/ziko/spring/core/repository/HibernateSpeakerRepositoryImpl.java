package ziko.spring.core.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import ziko.spring.core.model.Speaker;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Repository("SpeakerRepository")
public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    @Autowired
    private Calendar calendar;

    @Value("#{ T(java.lang.Math).random() * 100 }")
    private double seedNum;

    @Override
    public List<Speaker> findAll() {
        List<Speaker> speakers = new ArrayList<Speaker>();

        Speaker speaker = new Speaker();

        speaker.setFirstName("Zakaria");
        speaker.setLastName("Jouahri");
        speaker.setSeedNum(seedNum);

        System.out.println("calendar: " + calendar.getTime());
        speakers.add(speaker);

        return speakers;
    }
}
