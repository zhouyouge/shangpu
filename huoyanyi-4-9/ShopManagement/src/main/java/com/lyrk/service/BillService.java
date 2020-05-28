package com.lyrk.service;

import com.lyrk.entity.*;

public interface  BillService {

    /**
     * 新增楼栋
     */
    ResponseResult addBill(Bill_informationExpression bill);
    /**
     * 修改前查询楼栋信息
     */
    ResponseResult toUpdateBillOut(Bill_informationExpression bill);
    /**
     * 修改楼栋信息
     */
    ResponseResult  updateBillOut(Bill_informationExpression bill);
    /**
     * 删除
     */
    ResponseResult  deleteBill(Bill_informationExpression bill);
    /**
     * 全查
     */
    BillPage queryBillList(BillParameter parameter);
    /**
     * 全查的数据总条数
     */
    int  BillCount(BillParameter parameter);

}
