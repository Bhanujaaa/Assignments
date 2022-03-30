package com.Online.MovieTicketBooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Online.MovieTicketBooking.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
User findByEmail(String email);
User findByFirstName(String username);
}
