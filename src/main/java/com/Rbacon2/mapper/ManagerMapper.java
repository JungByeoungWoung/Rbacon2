package com.Rbacon2.mapper;


import com.Rbacon2.domain.user.ManagerUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ManagerMapper {
    @Select("select ID from ALBACON_USER")
    public String saveManager(ManagerUser managerUser);
}
