package jpabook.jpashopsecond.repository;

import jpabook.jpashopsecond.domain.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class OrderRepository {

    private final EntityManager em;

    public void save(Order order){
        em.persist(order);
    }

    public Order findOne(Long id){
        return em.find(Order.class, id);
    }

    /*public List<Order> findAll(OrderSearch orderSearch){
        //밑에 코드는 정적쿼리 만약 status나 name이 null인경우 오류 발생
        *//*return em.createQuery("select o from Order o join o.member m" + " where o.status = :status "
                 + " and m.name like :name", Order.class).setParameter("status", orderSearch.getOrderStatus())
                .setParameter("name", orderSearch.getMemberName()).getResultList();*//*

    }*/

}
