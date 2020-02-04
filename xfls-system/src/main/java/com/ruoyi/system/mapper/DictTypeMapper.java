package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.DictType;
import java.util.List;

/**
 * 字典类型Mapper接口
 * 
 * @author ruoyi
 * @date 2020-02-04
 */
public interface DictTypeMapper 
{
    /**
     * 查询字典类型
     * 
     * @param dictId 字典类型ID
     * @return 字典类型
     */
    public DictType selectDictTypeById(Long dictId);

    /**
     * 查询字典类型列表
     * 
     * @param dictType 字典类型
     * @return 字典类型集合
     */
    public List<DictType> selectDictTypeList(DictType dictType);

    /**
     * 新增字典类型
     * 
     * @param dictType 字典类型
     * @return 结果
     */
    public int insertDictType(DictType dictType);

    /**
     * 修改字典类型
     * 
     * @param dictType 字典类型
     * @return 结果
     */
    public int updateDictType(DictType dictType);

    /**
     * 删除字典类型
     * 
     * @param dictId 字典类型ID
     * @return 结果
     */
    public int deleteDictTypeById(Long dictId);

    /**
     * 批量删除字典类型
     * 
     * @param dictIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteDictTypeByIds(String[] dictIds);
}
