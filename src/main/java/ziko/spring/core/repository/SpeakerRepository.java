package ziko.spring.core.repository;

import ziko.spring.core.model.Speaker;

import java.util.List;

public interface SpeakerRepository {
    List<Speaker> findAll();
}
