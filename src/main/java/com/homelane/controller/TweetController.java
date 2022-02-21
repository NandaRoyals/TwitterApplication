package com.homelane.controller;

import com.homelane.model.Tweet;
import com.homelane.service.TweetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;

@RestController
public class TweetController {
    @Autowired
    private TweetService tweetService;

    @PostMapping("/addTweet")
    public Tweet saveTweet(@RequestBody Tweet tweet){
        tweet.setCreatedAt( LocalDateTime.now());
        return tweetService.AddTweet(tweet);

    }
    @GetMapping("/getTweets")
    public List<Tweet> getTweets(){
        return tweetService.getTweet();
       // return  tweetService.getTweet().stream().sorted(comparing(Tweet::getHashtag))

    }
    @PostMapping("updateTweet/{id}")
    public Tweet UpdateTweet(@PathVariable("id") int Id, @RequestBody Tweet tweet) {
        return tweetService.UpdateTweet(Id,tweet);
    }
    @DeleteMapping("/deleteTweet/{id}")
    public String deleteTweet(@PathVariable("id") int Id){
        return tweetService.deleteTweet(Id);
    }


}
