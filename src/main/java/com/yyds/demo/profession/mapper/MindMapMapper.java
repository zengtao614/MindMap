package com.yyds.demo.profession.mapper;

import com.yyds.demo.profession.mapper.MindMap;

public interface MindMapMapper {
    int deleteByPrimaryKey(String mapId);

    int insert(MindMap record);

    int insertSelective(MindMap record);

    MindMap selectByPrimaryKey(String mapId);

    int updateByPrimaryKeySelective(MindMap record);

    int updateByPrimaryKey(MindMap record);
}