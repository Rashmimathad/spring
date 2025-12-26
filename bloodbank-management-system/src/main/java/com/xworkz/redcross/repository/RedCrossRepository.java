package com.xworkz.redcross.repository;

import com.xworkz.redcross.dto.DonorAccountDTO;

import java.util.Optional;

public interface RedCrossRepository {
    boolean save(DonorAccountDTO donorAccountDTO);

    boolean duplicateCheck(String email);

    Optional<DonorAccountDTO> getDonorInfo(String email);

    Optional<DonorAccountDTO> getDonorInfoById(int id);

    boolean update(DonorAccountDTO donorAccountDTO);

    boolean delete(int id);
}
