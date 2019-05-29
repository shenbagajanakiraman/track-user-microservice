package com.stackroute.repository;

import com.stackroute.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface UserRepository extends JpaRepository<User,Integer> {

    //Spring boot automatically creates implementation

//    List<User> findByName(String name);
//
////    @Query
//    List<User> findByNameAndGender(String name,String gender);

}
