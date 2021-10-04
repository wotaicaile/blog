package com.ljn.blog.service;

import com.ljn.blog.vo.Result;
import com.ljn.blog.vo.params.CommentParam;

public interface CommentService {


    Result commentByArticleId(Long id);

    Result comment(CommentParam commentParam);
}