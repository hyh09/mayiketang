package demo.dao;

import demo.entity.Shopinfo;

/**
 * @单位名称：科大国创—电信资源事业部
 * @创建人：hu.yunhui
 * @创建时间: on 2020/4/28.
 * @by: DELL)
 */
public interface ShopInfoDao {

    int insert(Shopinfo shopinfo);

    Shopinfo selectByPrimaryKey(Long shopId);


    Shopinfo selectByPrimaryKey001(Long shopId);


}
