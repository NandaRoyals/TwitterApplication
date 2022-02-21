package com.homelane.serviceImpl;

import com.homelane.model.Tweet;
import com.homelane.repository.TweetRepository;
import com.homelane.service.TweetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TweetServiceImpl implements TweetService {

    @Autowired
    private TweetRepository tweetRepository;

    @Override
    public Tweet AddTweet(Tweet tweet)
    {
        return tweetRepository.save(tweet);
    }

    @Override
    public List<Tweet> getTweet() {
        return tweetRepository.findAll();
    }

    @Override
    public List<Tweet> getTweet(int id, Tweet tweet) {
        return (List<Tweet>) tweetRepository.getById(id);
    }

    @Override
    public Tweet UpdateTweet(int id, Tweet tweet) {
        Tweet tweetdb=tweetRepository.findById(id).get();
       if(tweetdb!= null){
           tweetdb.setText(tweet.getText());
       }

        return tweetRepository.save(tweetdb);
    }

    @Override
    public String deleteTweet(int id) {
        tweetRepository.deleteById(id);
        return "Tweet Deleted";
    }


}
