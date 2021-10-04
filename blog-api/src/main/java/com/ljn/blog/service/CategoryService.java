package com.ljn.blog.service;

import com.ljn.blog.vo.CategoryVo;
import com.ljn.blog.vo.Result;

public interface CategoryService {
    CategoryVo findCategoryById(Long categoryId);

    Result findAll();

    Result findAllDetail();

    Result categoriesDetailById(Long id);
}
