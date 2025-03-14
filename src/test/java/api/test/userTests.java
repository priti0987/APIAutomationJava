package api.test;

import api.payload.User;
import com.github.javafaker.Faker;
import org.testng.annotations.BeforeClass;

public class userTests {

    Faker faker;
    User userPayload;
    @BeforeClass
    public void setupData()
    {
        faker = new Faker();
        userPayload = new User();

        userPayload.setId(faker.idNumber().hashCode());
        userPayload.setUsername(faker.name().username());
        userPayload.setFirstName(faker.name().firstName());
        userPayload.setLastName(faker.name().lastName());
        userPayload.setEmail(faker.internet().safeEmailAddress());
        userPayload.setPassword(faker.internet().password(5,10));
        userPayload.setPhone(faker.phoneNumber().cellPhone());

    }
}
