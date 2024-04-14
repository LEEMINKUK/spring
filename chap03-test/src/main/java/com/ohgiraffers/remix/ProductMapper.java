package com.ohgiraffers.remix;

import java.util.List;

public interface ProductMapper {

    ProductAndRentalDTO selectProductById(int id);

    List<ProductAndRentalDTO> selectAllProduct();

    int registRental(RentalDTO rentalList);

    int modifyAll(ProductDTO productList);

    int modifyAllRental(RentalDTO rentalList);

    int delete(ProductAndRentalDTO productList);
}
