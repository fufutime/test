package com.fuzhao.ssm.mapper;

import com.fuzhao.ssm.bean.RoomInfo;
import com.fuzhao.ssm.bean.RoomType;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface RoomInfoMapper {
    public List<RoomInfo> selectAll();

    void del(Integer id);

    RoomInfo selectById(Integer id);

    void upDate(RoomInfo roomInfo);

    List<RoomType> selectAllType();

    void add(RoomInfo roomInfo);
}
