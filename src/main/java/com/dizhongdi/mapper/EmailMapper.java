package com.dizhongdi.mapper;

import com.dizhongdi.pojo.Email;
import org.apache.ibatis.annotations.Mapper;

/**
 * ClassName:EmailMapper
 * Package:com.dizhongdi.mapper
 * Description:
 *
 * @Date: 2021/8/6 20:19
 * @Author:dizhongdi
 */
@Mapper
public interface EmailMapper {
    Email getEmail(String emailAddress);
    void setEmail(Email email);
    void updateCode(Email email);

}
