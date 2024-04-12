package com.ohgiraffers.remix;

import java.util.List;

public class PrintResult {




    public void printErrorMessage(String error) {

        String errormessage = "";

        switch (error){
            case "productList" : errormessage = "전체 조회 실패...!";
            break;
            case "selectProduct" : errormessage = "ID 조회 실패....!! ";
            break;
            case "insert" : errormessage = "신규 추가 실패~~~~~!!!";
            break;
        }
        System.out.println(errormessage);
    }
    public void printProductList(List<ProductAndRentalDTO> productAndRental) {

        for (ProductAndRentalDTO product : productAndRental){
            System.out.println(product);
        }
    }

    public void printProduct(ProductAndRentalDTO product) {

        System.out.println(product);

    }

    public void printRentalMessage(String insert) {

        String insertRental = "";
        switch (insert){
            case "insert" : insertRental="신규 등록 성공....!!";
            break;
        }
        System.out.println(insertRental);
    }
}
