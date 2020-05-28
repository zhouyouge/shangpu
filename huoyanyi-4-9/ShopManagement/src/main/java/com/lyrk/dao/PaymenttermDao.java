package com.lyrk.dao;

import com.lyrk.entity.Paymentterm;
import com.lyrk.entity.PaymenttermParameter;
import com.lyrk.entity.ResponseResult;
import com.lyrk.entity.Tower_informationexpression;

import java.util.List;

public interface PaymenttermDao {
    int addPaymentterm(Paymentterm paymentterm);

    int towerCount(PaymenttermParameter parameter);

    List<Paymentterm> queryTowerList(PaymenttermParameter parameter);

    Paymentterm toUpdatePaymenttermWhereOut(Paymentterm paymentterm);

    int updatePaymentterm(Paymentterm paymentterm);

    int deletepaymentterm(Paymentterm towner1);
}
