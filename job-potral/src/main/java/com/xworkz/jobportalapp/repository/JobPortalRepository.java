package com.xworkz.jobportalapp.repository;

import com.xworkz.jobportalapp.dto.UserDTO;

public interface JobPortalRepository {
    boolean save(UserDTO userDTO);
}
