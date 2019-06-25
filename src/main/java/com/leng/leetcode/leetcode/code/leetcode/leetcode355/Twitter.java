package com.leng.leetcode.leetcode.code.leetcode.leetcode355;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * postTweet(userId, tweetId): 创建一条新的推文
 * getNewsFeed(userId): 检索最近的十条推文。每个推文都必须是由此用户关注的人或者是用户自己发出的。推文必须按照时间顺序由最近的开始排序。
 * follow(followerId, followeeId): 关注一个用户
 * unfollow(followerId, followeeId): 取消关注一个用户
 * @author leng
 * @date 2019/5/7
 **/
public class Twitter {

    private static Map<Integer, List<Integer>> userFollowerIdMap;

    private static List<Tweet> tweetList;

    public Twitter() {
        userFollowerIdMap = new HashMap<>();
        tweetList = new ArrayList<>();
    }

    public class Tweet {
        int userId;
        int tweetId;

        Tweet(int userId, int tweetId)
        {
            this.userId = userId;
            this.tweetId = tweetId;
        }
    }

    public void postTweet(int userId, int tweetId) {
        tweetList.add(new Tweet(userId, tweetId));
    }

    public List<Integer> getNewsFeed(int userId) {
        List<Integer> res = new ArrayList<>();
        List<Integer> userIdList = userFollowerIdMap.get(userId);
        if (userIdList == null) {
            userIdList = new ArrayList<>();
        }
        for (int i=tweetList.size()-1;i>=0;i--) {
            Tweet tweet = tweetList.get(i);
            if (userIdList.contains(tweet.userId) || tweet.userId == userId) {
                res.add(tweet.tweetId);
                if (res.size() == 10) {
                    return res;
                }
            }
        }
        return res;
    }

    public void follow(int followerId, int followeeId) {
        if (userFollowerIdMap.containsKey(followerId)) {
            userFollowerIdMap.get(followerId).add(followeeId);
        } else {
            List<Integer> followeeIdList = new ArrayList<>();
            followeeIdList.add(followeeId);
            userFollowerIdMap.put(followerId, followeeIdList);
        }
    }

    public void unfollow(int followerId, int followeeId) {
        if (userFollowerIdMap.containsKey(followerId)) {
            List<Integer> tmp = userFollowerIdMap.get(followerId);
            List<Integer> followerIdList = new ArrayList<>();
            for (Integer i : tmp) {
                if (i != followeeId) {
                    followerIdList.add(i);
                }
            }
            userFollowerIdMap.put(followerId, followerIdList);
        }
    }
}
