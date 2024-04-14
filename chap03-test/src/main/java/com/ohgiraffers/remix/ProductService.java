package com.ohgiraffers.remix;

import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.remix.Template.getSqlSession;

public class ProductService {
    public ProductAndRentalDTO selectProductById(int id) {

        SqlSession sqlSession = getSqlSession();

        ProductMapper productMapper = sqlSession.getMapper(ProductMapper.class);

        ProductAndRentalDTO product = productMapper.selectProductById(id);

        sqlSession.close();

        return product;
    }

    public List<ProductAndRentalDTO> selectAllProduct() {

        SqlSession sqlSession = getSqlSession();

        ProductMapper productMapper = sqlSession.getMapper(ProductMapper.class);

        List<ProductAndRentalDTO> productAndRental = productMapper.selectAllProduct();

        sqlSession.close();

        return productAndRental;
    }

    public boolean registRenatal(RentalDTO rentalList) {

        SqlSession sqlSession = getSqlSession();

        ProductMapper productMapper = sqlSession.getMapper(ProductMapper.class);

        int result = productMapper.registRental(rentalList);

        if(result >0){
            sqlSession.commit();
        }else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0? true : false;
    }

    public boolean modifyAll(ProductDTO productList) {
        SqlSession sqlSession = getSqlSession();

        ProductMapper productMapper = sqlSession.getMapper(ProductMapper.class);

        int result = productMapper.modifyAll(productList);

        if(result >0){
            sqlSession.commit();
        }else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0? true : false;

    }

    public boolean modifyAllRental(RentalDTO rentalList) {
        SqlSession sqlSession = getSqlSession();

        ProductMapper productMapper = sqlSession.getMapper(ProductMapper.class);

        int result = productMapper.modifyAllRental(rentalList);

        if(result >0){
            sqlSession.commit();
        }else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0? true : false;
    }

    public boolean delete(ProductAndRentalDTO productList) {
        SqlSession sqlSession = getSqlSession();

        ProductMapper productMapper = sqlSession.getMapper(ProductMapper.class);

        int result = productMapper.delete(productList);

        if(result >0){
            sqlSession.commit();
        }else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0? true : false;
    }
}
