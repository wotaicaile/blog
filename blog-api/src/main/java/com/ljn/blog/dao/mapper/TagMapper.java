package com.ljn.blog.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ljn.blog.dao.pojo.Tag;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TagMapper extends BaseMapper<Tag> {

    List<Tag> findTagsByArticleId(Long articleId);

    List<Long> findHotsTagIds(int limit);

    List<Tag> findTagsByTagIds(List<Long> tagIds);
}