package com.fuzhao.ssm.controller;

import com.fuzhao.ssm.bean.RoomInfo;
import com.fuzhao.ssm.bean.RoomType;
import com.fuzhao.ssm.service.RoomInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.sound.midi.Soundbank;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

@Controller
@RequestMapping("/room")
@Transactional
public class RoomInfoController {
    @Autowired
    private RoomInfoService roomInfoService;
//查询方法
    @RequestMapping("/selectAll")
    public ModelAndView selectAll(ModelAndView model){
        List<RoomInfo> roomInfos = roomInfoService.selectAll();
        model.addObject("roomInfoList",roomInfos);
        model.setViewName("roomList");
        return model;
    }

    //删除方法
    @RequestMapping("/del")
    public String del(Integer id){
        if (id!=null){
            roomInfoService.del(id);
        }
 //跳转回查询方法实现实时刷新页面
        return "redirect:selectAll";
    }

    //跳转到更新页面的方法
    @RequestMapping("/toUpdate")
    public ModelAndView toUpDate(ModelAndView model,Integer id){
        RoomInfo roomInfo = roomInfoService.selectById(id);
        model.addObject("room",roomInfo);
        model.setViewName("updateRoom");
        return model;
    }
//更新方法
    @RequestMapping("/update")
    public String upDate(RoomInfo roomInfo) {
        roomInfo.setBuyState(2);
        roomInfo.setTotalPrice(roomInfo.getJoinDay()*roomInfo.getRoomPrice());
        System.out.println(roomInfo);
        roomInfoService.upDate(roomInfo);
        return "redirect:selectAll";
    }
//跳转增加页面显示房间类型
    @RequestMapping("/toAdd")
    public ModelAndView toAdd(ModelAndView model){
        List<RoomType> roomTypes = roomInfoService.selectAllType();
        System.out.println(roomTypes);
        model.addObject("roomTypeList",roomTypes);
        model.setViewName("addRoom");
        return model;
    }
//增加方法
    @RequestMapping("/add")
    public String add(RoomInfo roomInfo){
        roomInfoService.add(roomInfo);
        return "redirect:selectAll";
    }
}
