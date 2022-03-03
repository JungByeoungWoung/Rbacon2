package com.Rbacon2.mapper;


import com.Rbacon2.domain.user.ManagerUser;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface ManagerMapper {
    public void saveManager(ManagerUser managerUser);
}
