package com.cetrinw.domain.service;

import com.cetrinw.domain.entity.BootUser;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by Cetrin Wang on 2017/2/21.
 */
public interface IUserService {

    List<BootUser> findByAge(String name);

    BootUser findById(String id);

    BootUser query(@Param("id") String id);

    BootUser namedQuery(String id);
}
