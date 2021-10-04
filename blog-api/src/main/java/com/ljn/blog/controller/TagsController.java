package com.ljn.blog.controller;


import com.ljn.blog.vo.Result;
import com.ljn.blog.vo.TagVo;
import com.ljn.blog.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("tags")
public class TagsController {

    @Autowired
    private TagService tagService;

    @GetMapping("hot")
    public Result hot() {
        int limit = 6;
        return tagService.hots(limit);
    }
    @GetMapping
    public Result findAll(){
        return tagService.findAll();
    }
    @GetMapping("detail")
    public Result findAllDetail(){
        return tagService.findAllDetail();
    }
    @GetMapping("detail/{id}")
    public Result findDetailById(@PathVariable("id") Long id){
        return tagService.findDetailById(id);
    }

}