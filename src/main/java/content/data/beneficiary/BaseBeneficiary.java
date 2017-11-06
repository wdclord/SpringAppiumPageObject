package content.data.beneficiary;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Accessors(chain = true)
@Component
public class BaseBeneficiary {

    private String country;
    private String currency;
    private String phoneNumber;
    private String emailAddress;

    private String postalCode;
    private String firstAddressLine;
    private String secondAddressLine;
    private String city;


    // TODO needs refactoring
    private String firstName;
    private String lastName;

    private String companyName;

    private String IBAN;
    private String accountNUmber;
    private String BICSWIFT;
    private String sortCode;
    private String routingNumber;
}
