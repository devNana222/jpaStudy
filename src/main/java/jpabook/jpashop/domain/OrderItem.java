package jpabook.jpashop.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class OrderItem {
    @Id @GeneratedValue
    @Column(name="order_item_id")
    private Long id;

//    @Column(name="order_id")
//    private Long orderId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="order_id")
    private Order order;


//    @Column(name="item_id")
//    private Long itemId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="item_id")
    private Item item;

    private int orderPrice;
    private int count;
}
