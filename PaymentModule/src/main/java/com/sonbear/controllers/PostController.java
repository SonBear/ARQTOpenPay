package com.sonbear.controllers;

import com.sonbear.model.entities.Post;
import com.sonbear.model.services.PostService;
import java.util.List;

/**
 *
 * @author Sonbear
 */
public class PostController {

    private final PostService postService;

    public PostController() {
        this.postService = PostService.getInstance();
    }

    public void insertPost(Post post) {
        postService.insertPost(post);
    }

    public void removePost(Post post) {
        postService.removePost(post);
    }

    public Post getPostById(String id) {
        return postService.getPostById(id);
    }

    public boolean updatePost(String id, Post post) {
        return postService.updatePost(id, post);
    }

    public List<Post> getAllPublishedPosts(String sellerId) {
        return postService.getAllPublishedPosts(sellerId);
    }

    public List<Post> getAllUnpublishedPosts(String sellerId) {
        return postService.getAllUnpublishedPosts(sellerId);
    }

    public List<Post> getAllPublishedPost() {
        return postService.getAllPublishedPost();
    }

}
