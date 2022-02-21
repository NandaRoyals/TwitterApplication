package com.homelane.serviceImpl;

import com.homelane.model.Hashtag;
import com.homelane.model.Tweet;
import com.homelane.model.User;
import com.homelane.repository.HashtagRepository;
import com.homelane.service.HashtagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HashtagServiceImpl implements HashtagService {
    @Autowired
    private HashtagRepository hashtagRepository;

    @Override
    public Hashtag AddHashtag(Hashtag hashtag) {
        return hashtagRepository.save(hashtag);
    }

    @Override
    public List<Hashtag> getHashtag() {
        return hashtagRepository.findAll();
    }

    @Override
    public Hashtag UpdateHashtag(int id, Hashtag hashtag) {
        Hashtag hashtagdb = hashtagRepository.findById(id).get();
        if(hashtagdb!=null){
            hashtagdb.setName(hashtag.getName());

        }
        return hashtagRepository.save(hashtagdb);
    }

    @Override
    public String deleteHashtag(int id) {
        hashtagRepository.deleteById(id);
        return "Hashtag Deleted";
    }
}
