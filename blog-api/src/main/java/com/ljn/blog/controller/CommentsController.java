package com.ljn.blog.controller;

import com.ljn.blog.service.CommentService;
import com.ljn.blog.vo.Result;
import com.ljn.blog.vo.params.CommentParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("comments")
public class CommentsController {

    @Autowired
    private CommentService commentService;

    @GetMapping("article/{id}")
    public Result comments(@PathVariable("id") Long id){
        return commentService.commentByArticleId(id);
    }

    @PostMapping("create/change")
    public Result comment(@RequestBody CommentParam commentParam){
        return commentService.comment(commentParam);
    }
}