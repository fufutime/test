package com.fuzhao.ssm.service;

import com.fuzhao.ssm.bean.RoomInfo;
import com.fuzhao.ssm.bean.RoomType;

import java.util.List;

public interface RoomInfoService {
    public List<RoomInfo> selectAll();

    void del(Integer id);

    RoomInfo selectById(Integer id);

    void upDate(RoomInfo roomInfo);

    List<RoomType> selectAllType();

    void add(RoomInfo roomInfo);
}
