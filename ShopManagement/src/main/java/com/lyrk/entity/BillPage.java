package com.lyrk.entity;

import java.util.List;

public class BillPage extends  Page {

    private List<Bill_informationExpression> BillList;

    public List<Bill_informationExpression> getBillList() {
        return BillList;
    }

    public void setBillList(List<Bill_informationExpression> billList) {
        BillList = billList;
    }
}
