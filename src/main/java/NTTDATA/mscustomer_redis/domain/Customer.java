package NTTDATA.mscustomer_redis.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Customer implements Serializable{
    private String firstname;
    private String lastname;
    private String emailAddress;
    private String status;
}
