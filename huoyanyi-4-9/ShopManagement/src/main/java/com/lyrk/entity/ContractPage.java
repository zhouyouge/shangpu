package com.lyrk.entity;

import java.util.List;

public class ContractPage extends Page{
    private List<Townercontract> ContractList;

    public List<Townercontract> getContractList() {
        return ContractList;
    }

    public void setContractList(List<Townercontract> contractList) {
        ContractList = contractList;
    }
}
