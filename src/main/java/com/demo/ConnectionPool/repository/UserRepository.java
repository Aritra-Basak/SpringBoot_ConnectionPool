/**
 * 
 */
package com.demo.ConnectionPool.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.ConnectionPool.entity.User;

/**
 * @author Aritra
 *
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
