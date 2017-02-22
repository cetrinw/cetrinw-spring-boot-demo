package com.cetrinw.domain.dao;

import com.cetrinw.domain.entity.BootUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Cetrin Wang on 2017/2/21.
 */
public interface UserRepository extends JpaRepository<BootUser, String> {
//    List<BootUser> findByAge(String name);
//
//    BootUser findById(String id);
//
//    @Query("select u from BootUser u where u.id = :id")
//    BootUser query(@Param("id") String id);
//
//    /**
//     * 与实体类对应
//     * @param id
//     * @return
//     */
//    BootUser namedQuery(String id);

}
