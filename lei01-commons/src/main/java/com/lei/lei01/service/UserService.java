package com.lei.lei01.service;

import com.lei.lei01.pojo.User;

public interface UserService {
	User getUser(Integer id);
	void addScore(Integer id, Integer score);
}