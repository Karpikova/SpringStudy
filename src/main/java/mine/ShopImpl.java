package mine;

import org.springframework.stereotype.Component;

/**
 * @author MKarpikova
 * @since 13.09.2018
 */
@Component
public class ShopImpl implements Shop {

    private String name = "Cats shop";

    public String getName() {
        return name;
    }

}
