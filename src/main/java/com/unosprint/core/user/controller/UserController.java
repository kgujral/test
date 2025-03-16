package com.unosprint.core.user.controller;

import com.unosprint.core.user.domain.User;
import com.sixsprints.core.annotation.Authenticated;
import com.unosprint.core.user.mapper.UserDetailDtoMapper;
import com.unosprint.core.user.mapper.UserCrudDtoMapper;
import com.unosprint.core.user.dto.UserSearchDto;
import com.sixsprints.core.controller.AbstractCrudController;
import com.unosprint.core.user.dto.UserCrudDto;
import org.springframework.web.bind.annotation.RequestMapping;
import com.unosprint.core.user.dto.UserDetailDto;
import com.unosprint.core.user.service.UserService;
import org.springframework.web.bind.annotation.RestController;
import com.unosprint.core.user.mapper.UserSearchDtoMapper;
@RestController
@RequestMapping(value="/api/v1/user")
@Authenticated(entity="USER")
public class UserController extends AbstractCrudController<User,UserSearchDto,UserDetailDto,UserCrudDto> {







public UserController(
UserService userService,
UserSearchDtoMapper userSearchDtoMapper,
UserDetailDtoMapper userDetailDtoMapper,
UserCrudDtoMapper userCrudDtoMapper){

    super(userService


            ,userSearchDtoMapper


            ,userDetailDtoMapper


            ,userCrudDtoMapper


            )


; 


}


}