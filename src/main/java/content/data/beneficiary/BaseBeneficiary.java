package content.data.beneficiary;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Accessors(chain = true)
@Component
public abstract class BaseBeneficiary {

    private String country;
    private String currency;
    private String phoneNumber;
    private String emailAddress;

    private String postalCode;
    private String firstAddressLine;
    private String secondAddressLine;
    private String city;


    // TODO it's not ok. First place to refactor
    private String firstName;
    private String lastName;

    private String companyName;

    private String IBAN;
    private String accountNUmber;
    private String BICSWIFT;
    private String sortCode;
    private String routingNumber;
}
