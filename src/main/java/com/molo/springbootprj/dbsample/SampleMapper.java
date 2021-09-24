package com.molo.springbootprj.dbsample;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface SampleMapper {
    @Select("select BRDMEMO from tbl_board limit 1")
    String selectSampleData();
}
