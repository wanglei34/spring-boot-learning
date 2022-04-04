package com.wl.boot.datasource.service;

import com.wl.boot.datasource.entity.BootUser;
import com.wl.boot.datasource.mapper.primary.PrimaryMapper;
import com.wl.boot.datasource.mapper.secondary.SecondaryMapper;
import org.apache.logging.log4j.message.Message;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 17997
 */
@Service
public class BootUserService {
    @Resource
    private PrimaryMapper primaryMapper;
    @Resource
    private SecondaryMapper secondaryMapper;

    public List<BootUser> getUsers() {
        List<BootUser> primaryUsers = primaryMapper.selectAll();
        List<BootUser> secondaryUsers = secondaryMapper.selectAll();
        List<BootUser> result = new ArrayList<>();
        result.addAll(primaryUsers);
        result.addAll(secondaryUsers);
        return result;
    }
    //@Transactional(rollbackFor = {RuntimeException.class})
    public void saveUser(BootUser bootUser) {
        primaryMapper.insert(bootUser);
        //int a = 2 / 0;
        secondaryMapper.insert(bootUser);
    }
}