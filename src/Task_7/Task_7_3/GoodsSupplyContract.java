package Task_7.Task_7_3;

import java.util.Date;

public class GoodsSupplyContract extends Documents{

    public String goodsType;
    public int numOfGoods;

    public GoodsSupplyContract(int documentNumber, Date date, String goodsType, int numOfGoods) {
        super(documentNumber, date);
        this.goodsType = goodsType;
        this.numOfGoods = numOfGoods;
    }

    @Override
    public String toString() {
        return "GoodsSupplyContract{" +
                "Тип предмета: " + goodsType + '\n' +
                "Количество предметов: " + numOfGoods + '\n' +
                "Номер документа: " + documentNumber + '\n' +
                "Дата: " + date +
                '}';
    }
}
