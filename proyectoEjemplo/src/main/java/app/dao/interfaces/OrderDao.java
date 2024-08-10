package app.dao.interfaces;

import app.dto.OrderDto;

public interface OrderDao {
	public void createOrder(OrderDto orderDto) throws Exception;
}
