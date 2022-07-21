package ziko.spring.core.service;

import ziko.spring.core.model.Speaker;

import java.util.List;

public interface SpeakerService {
    List<Speaker> findAll();
}
