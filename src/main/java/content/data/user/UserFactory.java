package content.data.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserFactory {

    @Autowired
    private User user;

    public User getDefaultUser() {
        return user
                .setCountry("United Kingdom")
                .setPhoneNumber("1217104665")
                .setPasscode(1245);
    }
}
