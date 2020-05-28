package com.lyrk.entity;

import java.util.List;

public class BillPage extends  Page {

    private List<Bill_informationExpression> billList;

    public List<Bill_informationExpression> getBillList() {
        return billList;
    }

    public void setBillList(List<Bill_informationExpression> billList) {
        this.billList = billList;
    }
}
