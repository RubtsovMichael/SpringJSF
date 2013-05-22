package com.rubtsov.entry.repository;

import java.util.List;

import com.rubtsov.entry.model.Entry;


public interface EntriesRepository {
    List<Entry> getEntries();

    Entry getEntryByName(String name);

    Entry getEntryById(int id);
}
