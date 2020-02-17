package com.ruoyi.system.service.impl;



import com.ruoyi.system.domain.SysDotMap;
import com.ruoyi.system.mapper.SysDotMapMapper;
import com.ruoyi.system.service.ISysDotMapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Map;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author yanye
 * @date 2020-02-05
 */
@Service
public class SysDotMapServiceImpl implements ISysDotMapService {
    @Autowired
    private SysDotMapMapper sysDotMapMapper;




    @Override
    public List<SysDotMap> selectDotMapList() {
        return sysDotMapMapper.selectDotMapList();
    }
}