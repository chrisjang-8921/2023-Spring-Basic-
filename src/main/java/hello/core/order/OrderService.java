package hello.core.order;

public interface OrderService {

    Order CreateOrder(Long MemberId, String itemName, int itemPrice);

}
