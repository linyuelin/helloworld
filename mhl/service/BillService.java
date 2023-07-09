package com.dreamTank.mhl.service;

import com.dreamTank.mhl.dao.BasicDAO;
import com.dreamTank.mhl.dao.BillDAO;
import com.dreamTank.mhl.dao.MultTableBeanDAO;
import com.dreamTank.mhl.domain.Bill;
import com.dreamTank.mhl.domain.MultTableBean;

import java.util.List;
import java.util.UUID;

public class BillService {
    private BasicDAO basicDAO = new BillDAO();
    private MenuService menuService = new MenuService();

    private DiningTableService diningTableService = new DiningTableService();

    private BillDAO billDAO = new BillDAO();

    private MultTableBeanDAO multTableBeanDAO = new MultTableBeanDAO();

    public boolean orderMenu(int menuId, int nums, int diningTableId) {
        String billId = UUID.randomUUID().toString();

        int update = basicDAO.update("insert into bill values(null,?,?,?,?,?,now(),'未结账')",
                billId, menuId, nums, menuService.getMenuById(menuId).getPrice() * nums, diningTableId);

        if (update <= 0) {
            return false;
        }

        return diningTableService.updateDiningTableState(diningTableId, "就餐中");

    }

//    public List<Bill> list() {
//        return billDAO.queryMulti("select * from bill ", Bill.class);
//
//    }

    public List<MultTableBean> list2() {
      return   multTableBeanDAO.queryMulti(" select bill.* , menu.name  from bill,menu where bill.menuId = menu.id", MultTableBean.class);
    }

    //查看是否有未结账的账单
    public boolean hasPayBillByDiningTableId(int diningTableId) {
        Bill bill = billDAO.querySingle("select * from bill where diningTableId = ? and state = '未结账' limit 0,1 ", Bill.class, diningTableId);
        return bill != null;

    }

    //完成结账
    public boolean payBill(String payMode, int diningTableId) {
        //1修改bill表
        int update = billDAO.update("update bill set state = ? where diningTableId  = ? and state = '未结账'", payMode, diningTableId);
        if (update <= 0) {
            return false;
        }
        //2修改diningTable
        if (!diningTableService.updateDiningTableToFree(diningTableId, "空")) {
            return false;
        }
        return true;

    }
}
