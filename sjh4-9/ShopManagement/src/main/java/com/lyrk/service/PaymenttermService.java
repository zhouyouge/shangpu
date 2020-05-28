package com.lyrk.service;

import com.lyrk.entity.*;

public interface PaymenttermService {
    /**
     * 新增楼栋
     */
    ResponseResult addPaymentterm(Paymentterm paymentterm);

    PaymenttermPage queryPaymentTermList(PaymenttermParameter parameter);

    ResponseResult toupdateChaPaymentterm(Paymentterm towner);

    ResponseResult updatePaymentterm(Paymentterm paymentterm);

    ResponseResult deletepaymentterm(Paymentterm towner1);
}
