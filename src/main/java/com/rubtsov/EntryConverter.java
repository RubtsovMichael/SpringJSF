package com.rubtsov;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.jsf.FacesContextUtils;

import com.rubtsov.entry.service.EntriesServise;

//@Component(value = "entryConverter")
@FacesConverter(value = "entryConverter")
public class EntryConverter implements Converter {

    private static final Logger LOG = Logger.getLogger(EntryConverter.class);
    
    public EntryConverter() {
        LOG.debug(this.getClass().getCanonicalName() + " instantinated.");
    }

//    @Autowired
//    private EntriesServise entriesServise;
    
    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        LOG.debug("getAsObject " +  value);

        WebApplicationContext applicationContext = FacesContextUtils.getWebApplicationContext(FacesContext.getCurrentInstance());
        EntriesServise entriesServise = applicationContext.getBean(EntriesServise.class);
        
        LOG.debug("applicationContext " +  applicationContext);
        return entriesServise.getEntryByName(value);
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        LOG.debug("getAsString " +  value);
        return value.toString();
    }

}
