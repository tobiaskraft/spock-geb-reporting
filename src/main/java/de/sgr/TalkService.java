package de.sgr;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
class TalkService {
    static private List<Talk> all = new ArrayList<Talk>();

    public Talk save(String title, String description, List<String> keywords) {
        Talk t = new Talk(title, description, keywords);
        all.add(t);
        return t;
    }

    public void accept(String title) {
        System.out.println("talk accepted: "+title);
    }

}
