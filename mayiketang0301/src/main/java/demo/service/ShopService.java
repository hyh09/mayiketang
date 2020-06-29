package demo.service;


import demo.dao.ShopInfoDao;
import demo.entity.Shopinfo;

import javax.annotation.Resource;

/**
 * @单位名称：科大国创—电信资源事业部
 * @创建人：hu.yunhui
 * @创建时间: on 2020/4/28.
 * @by: DELL)
 */

//@Service
public class ShopService {

    @Resource
    ShopInfoDao shopInfoDao;


    public  void saveShop(Shopinfo shopinfo){
        shopInfoDao.insert(shopinfo);
    }


    public  Shopinfo  queryShop(Long userId){
        return  shopInfoDao.selectByPrimaryKey(userId);
    }
}
