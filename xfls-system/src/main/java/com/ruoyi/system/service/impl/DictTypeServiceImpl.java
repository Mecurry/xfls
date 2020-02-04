package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.DictTypeMapper;
import com.ruoyi.system.domain.DictType;
import com.ruoyi.system.service.IDictTypeService;
import com.ruoyi.common.core.text.Convert;

/**
 * 字典类型Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-02-04
 */
@Service
public class DictTypeServiceImpl implements IDictTypeService 
{
    @Autowired
    private DictTypeMapper dictTypeMapper;

    /**
     * 查询字典类型
     * 
     * @param dictId 字典类型ID
     * @return 字典类型
     */
    @Override
    public DictType selectDictTypeById(Long dictId)
    {
        return dictTypeMapper.selectDictTypeById(dictId);
    }

    /**
     * 查询字典类型列表
     * 
     * @param dictType 字典类型
     * @return 字典类型
     */
    @Override
    public List<DictType> selectDictTypeList(DictType dictType)
    {
        return dictTypeMapper.selectDictTypeList(dictType);
    }

    /**
     * 新增字典类型
     * 
     * @param dictType 字典类型
     * @return 结果
     */
    @Override
    public int insertDictType(DictType dictType)
    {
        dictType.setCreateTime(DateUtils.getNowDate());
        return dictTypeMapper.insertDictType(dictType);
    }

    /**
     * 修改字典类型
     * 
     * @param dictType 字典类型
     * @return 结果
     */
    @Override
    public int updateDictType(DictType dictType)
    {
        dictType.setUpdateTime(DateUtils.getNowDate());
        return dictTypeMapper.updateDictType(dictType);
    }

    /**
     * 删除字典类型对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteDictTypeByIds(String ids)
    {
        return dictTypeMapper.deleteDictTypeByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除字典类型信息
     * 
     * @param dictId 字典类型ID
     * @return 结果
     */
    @Override
    public int deleteDictTypeById(Long dictId)
    {
        return dictTypeMapper.deleteDictTypeById(dictId);
    }
}
