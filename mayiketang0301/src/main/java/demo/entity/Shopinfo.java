package demo.entity;

/**
 * @单位名称：科大国创—电信资源事业部
 * @创建人：hu.yunhui
 * @创建时间: on 2020/4/28.
 * @by: DELL)
 */
public class Shopinfo {

    /**
     * 商品的id
     */
    private  Long shopId;

    /**
     * 商品的名
     */
    private  String shopName;
    /**
     * 商品账户
     */
    private String account;

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Shopinfo{");
        sb.append("shopId=").append(shopId);
        sb.append(", shopName='").append(shopName).append('\'');
        sb.append(", account='").append(account).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
