package com.my.service;

import com.my.config.Myconst;
import com.my.model.User;
import com.my.util.CommonUtil;
import org.springframework.stereotype.Service;

import java.util.HashMap;

/**
 * Created by zunyun on 17-12-7.
 */
@Service
public class UserService {

    public HashMap GetUser(String userName){
        HashMap user = new HashMap();

        if (userName.equals(Myconst.USER_NAME))
            user.put("name",userName);
            user.put("password",CommonUtil.getMD5(Myconst.USER_PASSWORD));

        return user;
    }

}
