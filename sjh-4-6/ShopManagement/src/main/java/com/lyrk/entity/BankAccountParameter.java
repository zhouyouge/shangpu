package com.lyrk.entity;

import java.util.Date;

public class BankAccountParameter  extends  Page{

        private  int bankId;
        private Date startTime;
        private Date outTime;
        private String bankName  ;

        public Date getStartTime() {
                return startTime;
        }

        public void setStartTime(Date startTime) {
                this.startTime = startTime;
        }

        public Date getOutTime() {
                return outTime;
        }

        public void setOutTime(Date outTime) {
                this.outTime = outTime;
        }

        public String getBankName() {
                return bankName;
        }

        public void setBankName(String bankName) {
                this.bankName = bankName;
        }

        public int getBankId() {
                return bankId;
        }

        public void setBankId(int bankId) {
                this.bankId = bankId;
        }
}
