package com.rubtsov;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.context.annotation.Scope;

import com.rubtsov.entry.model.Entry;
import com.rubtsov.entry.service.EntriesServise;

@Named
@Scope("session")
public class IndexBean implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = -6444918677913059128L;
    
    @Inject 
    private EntriesServise entriesServise;
    
    private String selectedName;
    
    public List<Entry> getEntries() {
        return entriesServise.getEntries();
    }

    public String getSelectedName() {
        return selectedName;
    }

    public void setSelectedName(String selectedName) {
        this.selectedName = selectedName;
    }
    
}
