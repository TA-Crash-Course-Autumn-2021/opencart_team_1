package com.opencart.steps.Menu;

import com.opencart.pages.Menu.ComparePage;

public class ComparePageBL {

    private ComparePage comparePage;

    public ComparePageBL(){ comparePage = new ComparePage(); }

    public ComparePageBL compareAddToCart(String product){
        comparePage.getCompareAddToCart().get(comparePage.getIndex(product)).click();
        return this;
    }

    public ComparePageBL compareRemove(String product){
        comparePage.getCompareRemove().get(comparePage.getIndex(product)).click();
        return this;
    }

    public ComparePageBL compareClickOnProduct(String product){
        comparePage.getProducts().get(comparePage.getIndex(product)).click();
        return new ComparePageBL();
    }
}