package com.rubtsov.entry.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rubtsov.entry.model.Entry;
import com.rubtsov.entry.repository.EntriesRepository;

@Service("entriesService")
public class EntriesServise {

    @Autowired
    private EntriesRepository repository;
    
    public List<Entry> getEntries() {
        return repository.getEntries();
    }
    
    public Entry getEntryByName(String name) {
        return repository.getEntryByName(name);
    }

    public Entry getEntryById(int id) {
        return repository.getEntryById(id);
    }
}
