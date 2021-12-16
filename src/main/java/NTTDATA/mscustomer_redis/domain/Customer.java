package NTTDATA.mscustomer_redis.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    private String firstname;
    private String lastname;
    private String emailAddress;
    private String status;
}
