package com.ohgiraffers.remix;

import java.util.List;
import java.util.Map;

public class ProductController {

    private final PrintResult printResult;

    private final ProductService productService;

    public ProductController(){
        printResult = new PrintResult();
        productService = new ProductService();
    }
    public void selectAllMenu() {

        List<ProductAndRentalDTO> productAndRental = productService.selectAllProduct();

        if (productAndRental != null){
            printResult.printProductList(productAndRental);
        }else {
            printResult.printErrorMessage("selectList");
        }
    }

    public void selectMenuByCode(Map<String,String> parameter) {

        int id = Integer.parseInt(parameter.get("id"));

        ProductAndRentalDTO product = productService.selectProductById(id);

        if (product != null){
            printResult.printProduct(product);
        }else {
            printResult.printErrorMessage("selectProduct");
        }
    }

    public void registMenu(Map<String,String> parameter) {
        int price = Integer.parseInt(parameter.get("price"));
        String rental = parameter.get("rental");

        RentalDTO rentalList = new RentalDTO();
        rentalList.setPrice(price);
        rentalList.setRental(rental);
        if (productService.registRenatal(rentalList)){
            printResult.printRentalMessage("insert");
        }else {
            printResult.printErrorMessage("insert");
        }

    }

    public void modifyMenu(Object o) {
    }

    public void deleteMenu(Object o) {
    }
}
