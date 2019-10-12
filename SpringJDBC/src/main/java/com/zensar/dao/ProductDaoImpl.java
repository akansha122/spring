package com.zensar.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.zensar.entities.Product;

/**
 * @author Akansha Shah
 * @Creation_date 4th Oct 2019 10.23AM
 * @Modification_date 10th Oct 2019 04.02AM
 * @version 3.0
 * @Copyright Zensar Technologies. All rights reserved
 * @description It is an dao class used in persistent layer.
 */
@Repository
public class ProductDaoImpl implements ProductDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Product> getAll() {
		String sql = "select * from product";
		return jdbcTemplate.query(sql, new ResultSetExtractor<List<Product>>() {

			@Override
			public List<Product> extractData(ResultSet rs) throws SQLException, DataAccessException {
				List<Product> products = new ArrayList();
				while (rs.next()) {
					Product product = new Product();
					product.setProductId(rs.getInt(1));
					product.setName(rs.getString(2));
					product.setBrand(rs.getString(3));
					product.setPrice(rs.getFloat(4));
					products.add(product);
				}
				return products;
			}
		});
	}

	@Override
	public Product getById(int productId) {
		String sql = "select * from product where product_id=?";
		return jdbcTemplate.query(sql, new Object[] { productId }, new ResultSetExtractor<Product>() {

			@Override
			public Product extractData(ResultSet rs) throws SQLException, DataAccessException {
				if (rs.next()) {
					Product product = new Product();
					product.setProductId(rs.getInt(1));
					product.setName(rs.getString(2));
					product.setBrand(rs.getString(3));
					product.setPrice(rs.getFloat(4));
					return product;
				} else
					return null;
			}
		});
	}

	@Override
	public void insert(Product product) {
		String sql = "insert into product values(?,?,?,?)";
		jdbcTemplate.update(sql, product.getProductId(), product.getName(), product.getBrand(), product.getPrice());
		System.out.println("new product is inserted");
	}

	@Override
	public void update(Product product) {
		String sql = "update product set name=?,brand=?,price=? where product_Id=?";
		jdbcTemplate.update(sql, product.getName(), product.getBrand(), product.getPrice(), product.getProductId());
		System.out.println("product is updated");
	}

	@Override
	public void delete(Product product) {
		String sql = "delete from product where product_id=?";
		jdbcTemplate.update(sql, product.getProductId());
		System.out.println("product is deleted");
	}
}
