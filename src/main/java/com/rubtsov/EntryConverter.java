package com.rubtsov;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import org.springframework.beans.factory.annotation.Autowired;

import com.rubtsov.entry.service.EntriesServise;

@FacesConverter("entryConverter")
public class EntryConverter implements Converter {

    @Autowired
    private EntriesServise entriesServise;
    
    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        return entriesServise.getEntryByName(value);
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        return value.toString();
    }

}
