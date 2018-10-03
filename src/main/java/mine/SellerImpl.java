package mine;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(ConfForSeller.class, ConfForShop.class);
        context.refresh();

        SellerImpl seller = (SellerImpl) context.getBean("sellerName");
        seller.printWorkStatusCertificate();

    }
}
