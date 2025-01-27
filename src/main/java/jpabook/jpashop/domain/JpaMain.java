package jpabook.jpashop.domain;

import jakarta.persistence.*;

public class JpaMain {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try{
            Order order = new Order();
            em.persist(order);
            //방법 1
            order.addOrderItem(new OrderItem());

            //방법 2. Member의 orderList - Order의 orderItems의 연결까지 만들지 않아도 되긴함.
//            OrderItem orderItem = new OrderItem();
//            orderItem.setOrder(order);
//            em.persist(orderItem);


            tx.commit();
        } catch (Exception e){
            tx.rollback();
        } finally {
            em.close();
        }

        //code

        em.close();
        emf.close();
    }
}
