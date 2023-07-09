package com.dreamTank.mhl.service;

import com.dreamTank.mhl.dao.MenuDAO;
import com.dreamTank.mhl.domain.Menu;
import java.util.List;


public class MenuService {
    private MenuDAO menuDAO = new MenuDAO();

    public List<Menu> list(){
     return menuDAO.queryMulti("select * from menu", Menu.class);
    }

    public Menu getMenuById(int id){
        return  menuDAO.querySingle("select * from menu where id = ?", Menu.class,id);
    }

}
