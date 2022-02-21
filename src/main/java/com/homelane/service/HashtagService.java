package com.homelane.service;

import com.homelane.model.Hashtag;
import com.homelane.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface HashtagService {
    public Hashtag AddHashtag(Hashtag hashtag);
    List<Hashtag> getHashtag();
    public Hashtag UpdateHashtag(int id,Hashtag hashtag);
    public String deleteHashtag(int id);
}
