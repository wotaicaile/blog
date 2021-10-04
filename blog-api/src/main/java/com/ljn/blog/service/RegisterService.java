package com.ljn.blog.service;

import com.ljn.blog.vo.Result;
import com.ljn.blog.vo.params.RegisterParam;

public interface RegisterService {
    Result register(RegisterParam registerParam);
}
