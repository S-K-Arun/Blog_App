package com.springboot.blog.service;

import java.util.List;

import com.springboot.blog.payload.PostDto;
import com.springboot.blog.payload.PostResponse;

//import java.util.List;

public interface PostService {
    PostDto createPost(PostDto postDto);

    PostResponse getAllPosts(int pageNo, int pageSize, String sortBy, String sortDir);

    PostDto getPostById(long id);
    
    List<PostDto> getPostByLocation(String location);

    PostDto updatePost(PostDto postDto, long id);

    void deletePostById(long id);
}
