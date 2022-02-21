package com.homelane.service;

import com.homelane.model.Tweet;

import java.util.List;

public interface TweetService {

    public Tweet AddTweet(Tweet tweet);
    List<Tweet> getTweet();

    List<Tweet> getTweet(int id, Tweet tweet);

    public Tweet UpdateTweet(int id, Tweet tweet);
    public String deleteTweet(int id);


}
