package com.example.emos.wx.db.dao;

import com.example.emos.wx.db.pojo.TbMeeting;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
import java.util.HashMap;

@Mapper
public interface TbMeetingDao {

    public int insertMeeting(TbMeeting entity);

    public ArrayList<HashMap> searchMyMeetingListByPage(HashMap param);

    public boolean searchMeetingMembersInSameDept(String uuid);

    public int updateMeetingInstanceId(HashMap map);

}