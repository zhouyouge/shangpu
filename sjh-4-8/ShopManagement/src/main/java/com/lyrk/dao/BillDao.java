package com.lyrk.dao;

import com.lyrk.entity.BillParameter;
import com.lyrk.entity.Bill_informationExpression;
import com.lyrk.entity.TowerParameter;
import com.lyrk.entity.Tower_informationexpression;

import java.util.List;

public interface BillDao {

    /**
     * 新增开票信息
     * @param
     * @return
     */
    int addBill(Bill_informationExpression bill);
    /**
     * 修改前查询楼栋信息
     */
    Bill_informationExpression toUpdateBillOut(Bill_informationExpression bill);
    /**
     * 修改楼栋信息
     */
    int  updateBillOut(Bill_informationExpression bill);
    /**
     * 删除
     */
    int  deleteBill(Bill_informationExpression bill);
    /**
     * 全查
     */
    List<Bill_informationExpression> queryBillList(BillParameter parameter);
    /**
     * 全查的数据总条数
     */
    int  BillCount(BillParameter parameter);
}
