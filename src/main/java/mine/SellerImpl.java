package mine;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author MKarpikova
 * @since 13.09.2018
 */
@Component
public class SellerImpl implements Seller {

    @Autowired
    public Shop shop;

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public void printWorkStatusCertificate() {
        System.out.println("She's working in " + shop.getName());
    }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        SellerImpl seller = (SellerImpl) context.getBean(Seller.class);
        seller.printWorkStatusCertificate();

    }
}
