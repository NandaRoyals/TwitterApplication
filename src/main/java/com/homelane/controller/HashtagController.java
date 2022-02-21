package com.homelane.controller;

import com.homelane.model.Hashtag;
import com.homelane.model.User;
import com.homelane.service.HashtagService;
import com.homelane.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class HashtagController {
    @Autowired
    private HashtagService hashtagService;

    @PostMapping("/addHashtag")
    public Hashtag saveUser(@RequestBody Hashtag hashtag){
        return hashtagService.AddHashtag(hashtag);

    }
    @GetMapping("/getHashtag")
    public List<Hashtag> getHashtag(){
        return  hashtagService.getHashtag();

    }
    @PostMapping("updateHashtag/{id}")
    public Hashtag UpdateHashtag(@PathVariable("id") int Id, @RequestBody Hashtag hashtag) {
        return hashtagService.UpdateHashtag(Id,hashtag);
    }
    @DeleteMapping("/deleteHashtag/{id}")
    public String deleteHashtag(@PathVariable("id") int Id){

        return hashtagService.deleteHashtag(Id);
    }
}

