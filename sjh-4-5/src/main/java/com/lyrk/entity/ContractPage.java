package com.lyrk.entity;

import java.util.List;

public class ContractPage extends Page{
    private List<Townercontract> contractList;

    public List<Townercontract> getContractList() {
        return contractList;
    }

    public void setContractList(List<Townercontract> contractList) {
        this.contractList = contractList;
    }
}
