package com.happybean.conf;

import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.util.concurrent.GlobalEventExecutor;

/**
 * @author wgt
 * @date 2018-02-13
 * @description 存储整个工程的全局配置
 **/
public class NettyConfig {
    /**
     * 存储每一个客户端接入进来的channel
     * */
    public static ChannelGroup group =new DefaultChannelGroup(GlobalEventExecutor.INSTANCE);
}
