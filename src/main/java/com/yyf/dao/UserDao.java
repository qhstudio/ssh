package com.yyf.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.yyf.model.User;
/**
 * 用户Dao
 * @author yyf
 *
 */
public interface UserDao extends PagingAndSortingRepository<User,Long>{
	@Query("select u from User u where u.role.roleId < ?1")
    public Page<User> findUsersByRoleId(Long roleId, Pageable pageable);
}
