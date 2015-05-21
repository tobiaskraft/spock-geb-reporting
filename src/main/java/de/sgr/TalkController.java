package de.sgr;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class TalkController {

    @Autowired
    private TalkService talkService;

    public void bulkAccept(List<String> titles) {
        for (String title : titles) {
            talkService.accept(title);
        }
    }


}
