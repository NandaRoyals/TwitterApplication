package com.homelane.repository;

import com.homelane.model.Tweet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TweetRepository extends JpaRepository <Tweet,Integer>{
   @Query("select  tweet.id from tweet.tweet inner join tweet.hashtag on tweet.id =hashtag.tweet_id group by tweet.id order by tweet_id desc limit 5")
   public List<Integer> getTopFiveTweetsBasedOnHashtag();
}
