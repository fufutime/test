package com.fuzhao.ssm.service.impl;

import com.fuzhao.ssm.bean.RoomInfo;
import com.fuzhao.ssm.bean.RoomType;
import com.fuzhao.ssm.mapper.RoomInfoMapper;
import com.fuzhao.ssm.service.RoomInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service(value = "roomInfoService")
public class RoomInfoServiceImpl implements RoomInfoService {

    @Autowired
    private RoomInfoMapper roomInfoMapper;


    @Override
    public List<RoomInfo> selectAll() {
        return roomInfoMapper.selectAll();
    }

    @Override
    public void del(Integer id) {
        roomInfoMapper.del(id);
    }

    @Override
    public RoomInfo selectById(Integer id) {
        return roomInfoMapper.selectById(id);
    }

    @Override
    public void upDate(RoomInfo roomInfo) {
        roomInfoMapper.upDate(roomInfo);
    }

    @Override
    public List<RoomType> selectAllType() {
        return roomInfoMapper.selectAllType();
    }

    @Override
    public void add(RoomInfo roomInfo) {
        roomInfoMapper.add(roomInfo);
    }
}
