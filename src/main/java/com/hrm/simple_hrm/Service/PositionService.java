package com.hrm.simple_hrm.Service;

import java.util.List;
import java.util.Optional;

import com.hrm.simple_hrm.dao.PositionRepository;
import com.hrm.simple_hrm.model.Position;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * PositionService
 */
@Service
public class PositionService {

    @Autowired
    private PositionRepository positionRepository;

    public List<Position> getAll() {
        return positionRepository.findAll();
    }
    //create position
    public String create(Position position) {
        positionRepository.save(position);
        return position.toString();
    }
    // deletePosition s
    public void delete(String id) {
        positionRepository.deleteById(id);
    }

    public void deleteAll() {
        positionRepository.deleteAll();
    }

    // update
    public Optional<Position> update(String id, Position position) {
        position.setId(id);
        positionRepository.save(position);
        return positionRepository.findById(id);
    }

    // find
    public Optional<Position> findById(String id) {

        return positionRepository.findById(id);
    }

}