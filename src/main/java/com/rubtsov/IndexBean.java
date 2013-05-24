package com.rubtsov;

import java.io.Serializable;
import java.util.List;

import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rubtsov.entry.model.Entry;
import com.rubtsov.entry.service.EntriesServise;

@Named
@Scope("session")
public class IndexBean implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = -6444918677913059128L;
    
    private static final Logger LOG = Logger.getLogger(IndexBean.class);
    
    @Inject 
    private EntriesServise entriesServise;
    
    private String selectedName;
    
    private Entry selectedEntry;
    
    public List<Entry> getEntries() {
        return entriesServise.getEntries();
    }

    public String getSelectedName() {
        return selectedName;
    }

    public void setSelectedName(String selectedName) {
		LOG.debug("name set " + selectedName);
        this.selectedName = selectedName;
    }

	public Entry getSelectedEntry() {
		return selectedEntry;
	}

	public void setSelectedEntry(Entry selectedEntry) {
		LOG.debug("entry set " + selectedEntry);
		this.selectedEntry = selectedEntry;
	}
    
	public void hren() {
		LOG.debug("hren");		
	}
}
