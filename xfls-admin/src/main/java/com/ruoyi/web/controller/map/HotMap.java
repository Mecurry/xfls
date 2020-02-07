package com.ruoyi.web.controller.map;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.system.domain.XfFireManager;
import com.ruoyi.system.service.IXfFireManagerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.List;

/**
 * @Author hzc65
 * @Date 2020/2/6 14 03
 * @Describe
 */
@Controller
@RequestMapping("/map/hot")
@Api("百度热力图")
public class HotMap extends BaseController {
    private static final String PREFIX = "/map/hot";
    @Autowired
    private IXfFireManagerService iXfFireManagerService;

    /**
     * 跳转到热力图显示
     * @param model
     * @return
     */
    @RequiresPermissions("map:hot:view")
    @GetMapping()
    @ApiOperation("热力图")
    public String hot(Model model) {

        List<XfFireManager>  xfmList=this.getXY();//获取坐标xy
        if(xfmList.size()>0 && xfmList!=null){
            System.out.println("长度"+xfmList.size()+"值"+xfmList.get(0).getPlace());
            model.addAttribute("hotList",xfmList);
            return PREFIX + "/hot";
        }else{
            throw new NullPointerException("未取到坐标数据");
        }
    }

    /**
     * 获取坐标
     * @return
     */
    public List<XfFireManager> getXY(){

        List<XfFireManager> xfmList=iXfFireManagerService.selectXfFireManagerList(new XfFireManager());
        if(xfmList.size()>0 && xfmList!=null) return xfmList;

        return null;
    }
}
