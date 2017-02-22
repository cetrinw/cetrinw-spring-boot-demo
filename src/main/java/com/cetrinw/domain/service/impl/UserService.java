package com.cetrinw.domain.service.impl;

import com.cetrinw.base.BaseService;
import com.cetrinw.domain.entity.BootUser;
import com.cetrinw.domain.service.IUserService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


/**
 * Created by Cetrin Wang on 2017/2/21.
 */
@Service
public class UserService extends BaseService<BootUser,String> implements IUserService {

    @Resource(name = "userRepository")
    @Override
    protected void setEntity(JpaRepository repository) {
        super.setEntity(repository);
    }

    //    @Override
//    public List<BootUser> findByAge(String name) {
//        return dao.findByAge(name);
//    }
//
//    @Override
//    public BootUser findById(String id) {
//        return dao.findById(id);
//    }
//
//    @Override
//    public BootUser query(@Param("id") String id) {
//        return dao.query(id);
//    }
//
//    @Override
//    public BootUser namedQuery(String id) {
//        return dao.namedQuery(id);
//    }
}
