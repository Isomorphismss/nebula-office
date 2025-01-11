package com.example.emos.wx.service.impl;

import com.example.emos.wx.db.dao.TbMeetingDao;
import com.example.emos.wx.db.pojo.TbMeeting;
import com.example.emos.wx.exception.EmosException;
import com.example.emos.wx.service.MeetingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MeetingServiceImpl implements MeetingService {

    @Autowired
    private TbMeetingDao meetingDao;

    @Override
    public void insertMeeting(TbMeeting entity) {
        int row = meetingDao.insertMeeting(entity);
        if (row != 1) {
            throw new EmosException("会议添加失败");
        }
        //TODO 开启审批工作流
    }
}
