package de.sgr;

import org.apache.commons.lang3.StringUtils;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Talk {

    private String title;
    private String description;
    private List<String> keywords;
    private String location;
    private Date time;
    private List<Speaker> speakers = new ArrayList<>();


    public Talk(String title, String description, List<String> keywords) {
        this.title = title;
        this.description = description;
        this.keywords = keywords;
    }

    public Talk(String title, String description) {
        this.title = title;
        this.description = description;
    }


    public String getDescriptionShort() {
        return StringUtils.abbreviate(description, 120);
    }

    public List<String> getKeywords() {
        return keywords;
    }

    public String getTitle() {
        return title;
    }

    boolean validateKeywords() {
        String text = title + description;
        for (String keyword : this.getKeywords()) {
            if (!text.contains(keyword)) {
                return false;
            }
        }
        return true;
    }

    public Date getCreated() {
        return time;
    }

    public void assignSpeaker(Speaker speaker) {
        speakers.add(speaker);
    }

    public List<Speaker> getSpeaker() {
        return speakers;
    }



    @Override
    public String toString() {
        DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
        return "{title='" + title + "' time='" + df.format(time) + "'}";
    }
}
