package org.allen.dao;

import org.allen.po.School;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ISchoolDao {

    School querySchoolInfoById(Long treeId);

}
