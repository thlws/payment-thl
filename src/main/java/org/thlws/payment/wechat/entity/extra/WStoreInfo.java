package org.thlws.payment.wechat.entity.extra;

import cn.hutool.json.JSONUtil;
import org.thlws.payment.wechat.entity.request.UnifiedOrderRequest;
import org.thlws.payment.wechat.entity.request.WechatPayRequest;

import java.util.HashMap;

/**
 * Created by HanleyTang on 2017/11/23
 * 微信门店信息,用于数据上报
 * @author Hanley[hanley@thlws.com]
 * @version 1.0
 */

public class WStoreInfo{

    /**门店唯一标识 String(32)*/
    private String id;

    /**门店名称 String(64)*/
    private String name;

    /**
     * 门店行政区划码 String(6)<br>
     * @see <a href="https://pay.weixin.qq.com/wiki/doc/api/download/store_adress.csv">https://pay.weixin.qq.com/wiki/doc/api/download/store_adress.csv</a>
     *
     * */
    private String area_code;

    /**门店详细地址*/
    private String address;

    /**
     * Gets id.
     *
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets area code.
     *
     * @return the area code
     */
    public String getArea_code() {
        return area_code;
    }

    /**
     * Sets area code.
     *
     * @param area_code the area code
     */
    public void setArea_code(String area_code) {
        this.area_code = area_code;
    }

    /**
     * Gets address.
     *
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets address.
     *
     * @param address the address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 创建场景JSON数据,完成创建后，请将结果赋值给 scene_info
     * {@link WechatPayRequest#sceneInfo}
     * {@link UnifiedOrderRequest#sceneInfo}
     * @param id        the id 门店唯一编号
     * @param name      the name 门店名称
     * @param areaCode the area code 区域编码
     * @param address   the address 门店地址
     * @return 场景信息JSON string
     */
    public static String create(String id, String name, String areaCode, String address) {

        WStoreInfo info = new WStoreInfo();
        info.setAddress(address);
        info.setArea_code(areaCode);
        info.setId(id);
        info.setName(name);
        HashMap<String,Object> map = new HashMap<String, Object>();
        map.put("store_info",info);
        String json = JSONUtil.toJsonStr(map);
        return json;
    }

}
