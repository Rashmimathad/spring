package com.xworkz.redcross.repository;

import com.xworkz.redcross.dto.DonorAccountDTO;
import com.xworkz.redcross.entity.DonorAccountEntity;

import java.util.Optional;

public interface RedCrossRepository {
    boolean save(DonorAccountEntity donorAccountEntity);

    boolean duplicateCheck(String email);

    Optional<DonorAccountEntity> getDonorInfoByEmail(String email);

    Optional<DonorAccountEntity> getDonorInfoById(int id);

    boolean update(DonorAccountEntity donorAccountEntity);

    boolean delete(int id);
}
