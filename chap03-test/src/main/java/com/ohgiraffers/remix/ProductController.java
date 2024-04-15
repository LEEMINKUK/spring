package com.ohgiraffers.remix;

import java.util.Date;
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
        int id = Integer.parseInt(parameter.get("id"));
        int price = Integer.parseInt(parameter.get("price"));
        String rental = parameter.get("rental");

        RentalDTO rentalList = new RentalDTO();
        rentalList.setId(id);
        rentalList.setPrice(price);
        rentalList.setRental(rental);
        if (productService.registRenatal(rentalList)){
            printResult.printRentalMessage("update");
        }else {
            printResult.printErrorMessage("update");
        }

    }



    public void modifyMenu(Map<String,String> parameter) {
        int id = Integer.parseInt(parameter.get("id"));
        int price = Integer.parseInt(parameter.get("price"));
        String rental = parameter.get("rental");
        String model = parameter.get("model");
        String ram = parameter.get("ram");
        String ssd = parameter.get("ssd");
        String brand = parameter.get("brand");

        ProductDTO productList = new ProductDTO();
        productList.setId(id);
        productList.setBrand(brand);
        productList.setModel(model);
        productList.setRam(ram);
        productList.setSsd(ssd);

        if (productService.modifyAll(productList)){
            printResult.printModifyAllMessage("insert");
        }else {
            printResult.printErrorMessage("insert");
        }

        RentalDTO rentalList = new RentalDTO();
        rentalList.setId(id);
        rentalList.setPrice(price);
        rentalList.setRental(rental);
        if (productService.modifyAllRental(rentalList)){
            printResult.printModifyAllMessage("insert2");
        }else {
            printResult.printErrorMessage("insert2");
        }
    }

    public void deleteMenu(Map<String,String>parameter) {
        int id = Integer.parseInt(parameter.get("id"));
        ProductAndRentalDTO productList = new ProductAndRentalDTO();
        productList.setId(id);
        if (productService.delete(productList)){
            printResult.printDelete(id,"delete");
        }else {
            printResult.printErrorMessage("delete");
        }
    }
}
