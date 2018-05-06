package com.xiaobin.example.mapper;

import com.xiaobin.example.pojo.TParam;
import com.xiaobin.example.pojo.TParamExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TParamMapper {
    long countByExample(TParamExample example);

    int deleteByExample(TParamExample example);

    int insert(TParam record);

    int insertSelective(TParam record);

    List<TParam> selectByExample(TParamExample example);

    int updateByExampleSelective(@Param("record") TParam record, @Param("example") TParamExample example);

    int updateByExample(@Param("record") TParam record, @Param("example") TParamExample example);
}