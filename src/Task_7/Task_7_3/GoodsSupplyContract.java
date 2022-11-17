package Task_7.Task_7_3;

import java.util.Date;

public class GoodsSupplyContract extends Documents{

    String goodsType;
    int numOfGoods;

    public GoodsSupplyContract(int documentNumber, Date date, String goodsType, int numOfGoods) {
        super(documentNumber, date);
        this.goodsType = goodsType;
        this.numOfGoods = numOfGoods;
    }
}
