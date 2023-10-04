package com.pautoiddemooi.repo;

import java.util.UUID;

import org.springframework.data.cassandra.repository.CassandraRepository;

import com.pautoiddemooi.entity.User;

public interface UserRepo extends CassandraRepository<User, UUID> {

}
