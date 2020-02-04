package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.DictDataMapper;
import com.ruoyi.system.domain.DictData;
import com.ruoyi.system.service.IDictDataService;
import com.ruoyi.common.core.text.Convert;

/**
 * 字典数据Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-02-04
 */
@Service
public class DictDataServiceImpl implements IDictDataService 
{
    @Autowired
    private DictDataMapper dictDataMapper;

    /**
     * 查询字典数据
     * 
     * @param dictCode 字典数据ID
     * @return 字典数据
     */
    @Override
    public DictData selectDictDataById(Long dictCode)
    {
        return dictDataMapper.selectDictDataById(dictCode);
    }

    /**
     * 查询字典数据列表
     * 
     * @param dictData 字典数据
     * @return 字典数据
     */
    @Override
    public List<DictData> selectDictDataList(DictData dictData)
    {
        return dictDataMapper.selectDictDataList(dictData);
    }

    /**
     * 新增字典数据
     * 
     * @param dictData 字典数据
     * @return 结果
     */
    @Override
    public int insertDictData(DictData dictData)
    {
        dictData.setCreateTime(DateUtils.getNowDate());
        return dictDataMapper.insertDictData(dictData);
    }

    /**
     * 修改字典数据
     * 
     * @param dictData 字典数据
     * @return 结果
     */
    @Override
    public int updateDictData(DictData dictData)
    {
        dictData.setUpdateTime(DateUtils.getNowDate());
        return dictDataMapper.updateDictData(dictData);
    }

    /**
     * 删除字典数据对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteDictDataByIds(String ids)
    {
        return dictDataMapper.deleteDictDataByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除字典数据信息
     * 
     * @param dictCode 字典数据ID
     * @return 结果
     */
    @Override
    public int deleteDictDataById(Long dictCode)
    {
        return dictDataMapper.deleteDictDataById(dictCode);
    }
}
