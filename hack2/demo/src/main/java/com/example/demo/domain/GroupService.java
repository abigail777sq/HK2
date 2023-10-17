package com.example.demo.domain;

import com.example.demo.infrastracture.GroupRepository;
import com.example.demo.infrastracture.PersonaRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class GroupService {
    @Autowired
    private GroupRepository groupRepository;
    public Group saveGroup(Group group) {
        return groupRepository.save(group);
    }

    public Optional<Group> findgroupById(Long id) {
        return groupRepository.findById(id);
    }

    public List<Group> findAllgroups() {
        return groupRepository.findAll();
    }

  
}
