package com.rubtsov.entry.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.rubtsov.entry.model.Entry;

@Repository("entriesRepository")
public class HardcodedEntriesRepository implements EntriesRepository {

    private List<Entry> entries;
    
    @Override
    public List<Entry> getEntries() {
        if (entries == null) {
            entries = new ArrayList<Entry>();
            
            entries.add(new Entry(1, "first"));
            entries.add(new Entry(2, "second"));
            entries.add(new Entry(3, "third"));
        }
        
        return entries;
    }

    @Override
    public Entry getEntryByName(String name) {
        for (Entry entry : getEntries()) {
            if (entry.getName().equals(name)) {
                return entry;
            }
        }
        
        return null;
    }

    @Override
    public Entry getEntryById(int id) {
        for (Entry entry : getEntries()) {
            if (entry.getId() == id) {
                return entry;
            }
        }
        
        return null;
    }

}
