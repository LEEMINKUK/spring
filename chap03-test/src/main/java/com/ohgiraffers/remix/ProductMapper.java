package com.ohgiraffers.remix;

import java.util.List;

public interface ProductMapper {

    ProductAndRentalDTO selectProductById(int id);

    List<ProductAndRentalDTO> selectAllProduct();

    int registRental(RentalDTO rentalList);

}
