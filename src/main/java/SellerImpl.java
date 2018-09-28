import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author MKarpikova
 * @since 13.09.2018
 */
public class SellerImpl implements Seller{

    public Shop shop;

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public void printWorkStatusCertificate(){
        System.out.println("She's working in " + shop.getName());
    }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        SellerImpl seller = (SellerImpl) context.getBean("seller");
        SellerImpl seller = (SellerImpl) context.getBean(Seller.class); //This way wasn't in Spring 2
        seller.printWorkStatusCertificate();

    }
}