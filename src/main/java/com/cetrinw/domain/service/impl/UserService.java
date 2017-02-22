//package com.cetrinw.core.service.impl;
//
//import com.cetrinw.core.dao.UserRepository;
//import com.cetrinw.core.entity.BootUser;
//import com.cetrinw.core.service.IUserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.repository.query.Param;
//
//import java.util.List;
//
///**
// * Created by Cetrin Wang on 2017/2/21.
// */
//public class UserService implements IUserService {
//
//    @Autowired
//    UserRepository dao;
//
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
//}
