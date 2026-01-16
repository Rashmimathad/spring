package com.xworkz.rashmi_xworkzmodule.repository;

import com.xworkz.rashmi_xworkzmodule.entity.UserEntity;

public interface XworkzRepository {
    boolean save(UserEntity userEntity);

    String checkUser(String email);
}
