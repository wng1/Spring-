public class ProductRowMapper implements RowMapper<Product> {

	@Override
	public Product mapRow(ResultSet resultSet, int rowNum) throws SQLException {
		ProductExtractor productExtractor = new ProductExtractor();
		return productExtractor.extractData(resultSet);
	}

}
