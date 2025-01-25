package com.springboot.blog.service;

import com.springboot.blog.dto.CommentDto;
import com.springboot.blog.dto.PostDto;
import com.springboot.blog.dto.PostResponseDto;

import java.util.List;

public interface PostService {
    PostDto createPost (PostDto postDto);

    PostResponseDto getAllPosts(int pageNum, int pageSize, String sortBy, String sortDir);

    PostDto getPostById(long id);

    PostDto updatePost(PostDto postDto, long id);

    void deletePostById(long id);

    List<PostDto> getPostsByCategory(Long categoryId);
}
