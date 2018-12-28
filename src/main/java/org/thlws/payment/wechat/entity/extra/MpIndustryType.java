package org.thlws.payment.wechat.entity.extra;

/**
 * 微信行业属性表(截止2018-12-24全部属性)
 *
 * Created by  HanleyTang on 2018-12-24
 */
public enum MpIndustryInfo {

    it_internet("1", "IT科技","互联网|电子商务"),
    it_sw_service("2","IT科技","IT软件与服务"),
    it_hw_device("3","IT科技","IT硬件与设备"),
    it_el_tech("4","IT科技","电子技术"),
    it_mc_op("5","IT科技","通信与运营商"),
    it_web_game("6","IT科技","网络游戏"),

    finance_bank("7","金融业","银行"),
    finance_trust("8","金融业","基金理财信托"),
    finance_assure("9","金融业","保险"),

    repast_assure("10","餐饮","餐饮"),

    ht_hotel("11","酒店旅游","酒店"),
    ht_trip("12","酒店旅游","旅游"),

    transport_express("13","运输与仓储","快递"),
    transport_logistics("14","运输与仓储","物流"),
    transport_depot("15","运输与仓储","仓储"),

    education_training("16","教育","培训"),
    education_college("17","教育","院校"),

    government_research("18","政府与公共事业","学术科研"),
    government_police("19","政府与公共事业","交警"),
    government_museum("20","政府与公共事业","博物馆"),
    government_public("21","政府与公共事业","公共事业非盈利机构"),

    medicine_medical("22","医药护理","医药医疗"),
    medicine_beauty("23","医药护理","护理美容"),
    medicine_health("24","医药护理","保健与卫生"),

    traffic_car("25","交通工具","汽车相关"),
    traffic_motorcycle("26","交通工具","摩托车相关"),
    traffic_train("27","交通工具","火车相关"),
    traffic_airplane("28","交通工具","飞机相关"),

    estate_building("29","房地产","建筑"),
    estate_property("30","房地产","物业"),

    consumer_goods("31","消费品","消费品"),

    business_legal("32","商业服务","法律"),
    business_exhibition("33","商业服务","会展"),
    business_intermediary("34","商业服务","中介服务"),
    business_certification("35","商业服务","认证"),
    business_audit("36","商业服务","审计"),

    relax_media("37","文体娱乐","传媒"),
    relax_sports("38","文体娱乐","体育"),
    relax_leisure("39","文体娱乐","娱乐休闲"),

    publish("40","印刷","印刷"),

    other("41","其它","其它");


    public final String code;
    public final String primary;
    public final String secondary;

    MpIndustryInfo(String code, String primary, String secondary) {
        this.code = code;
        this.primary = primary;
        this.secondary = secondary;
    }


    /**
     * 根据主副业务,返回业务编码
     *
     * @param primary   the primary
     * @param secondary the secondary
     * @return the mp industry info
     */
    public MpIndustryInfo getMpIndustryInfo(String primary,String secondary) {
        for (MpIndustryInfo mpIndustryInfo : MpIndustryInfo.values()){
            if (mpIndustryInfo.primary.equalsIgnoreCase(primary) && mpIndustryInfo.secondary.equalsIgnoreCase(secondary)) {
                return mpIndustryInfo;
            }
        }
        return null;
    }
}
