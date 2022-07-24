package com.itcast.shopmall.order.controller;

import java.util.Arrays;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.itcast.shopmall.order.entity.MqMessageEntity;
import com.itcast.shopmall.order.service.MqMessageService;
import com.itcast.common.utils.PageUtils;
import com.itcast.common.utils.R;



/**
 * 
 *
 * @author hmm
 * @email 1771080823@qq.com
 * @date 2022-07-24 23:33:02
 */
@RestController
@RequestMapping("order/mqmessage")
public class MqMessageController {
    @Autowired
    private MqMessageService mqMessageService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("order:mqmessage:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = mqMessageService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{messageId}")
    //@RequiresPermissions("order:mqmessage:info")
    public R info(@PathVariable("messageId") String messageId){
		MqMessageEntity mqMessage = mqMessageService.getById(messageId);

        return R.ok().put("mqMessage", mqMessage);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("order:mqmessage:save")
    public R save(@RequestBody MqMessageEntity mqMessage){
		mqMessageService.save(mqMessage);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("order:mqmessage:update")
    public R update(@RequestBody MqMessageEntity mqMessage){
		mqMessageService.updateById(mqMessage);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("order:mqmessage:delete")
    public R delete(@RequestBody String[] messageIds){
		mqMessageService.removeByIds(Arrays.asList(messageIds));

        return R.ok();
    }

}
