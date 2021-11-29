/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myshop.paging;

import com.myshop.sort.Sorter;

/**
 *
 * @author asus
 */
public class PageRequest implements Pageble {

    private Integer page;
    private Integer maxPageItem;
    private Sorter sorter;

    public PageRequest(Integer page, Integer maxPageItem, Sorter sorter) {
        this.page = page;
        this.maxPageItem = maxPageItem;
        this.sorter = sorter;
    }

    @Override
    public Integer getPage() {
        return this.page;
    }

    @Override
    public Integer getOffset() {
        if (this.page != null && this.maxPageItem != null) {
            return (this.page - 1) * this.maxPageItem;
        }
        return null;
    }

    @Override
    public Integer getLimit() {
        return this.maxPageItem;
    }
    
    @Override
    public Sorter getSorter() {
        if(this.sorter != null){
            return this.sorter;
        }
        return null;
    }

}
