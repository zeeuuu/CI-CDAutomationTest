package webAutomationTest.pages;

import io.restassured.response.Response;
import static org.assertj.core.api.Assertions.assertThat;
import static webAutomationTest.Models.getListUsers;

public class ApiPage {
    String setURL;
    Response response;

    public void prepareUrlFor() {
        setURL = ("https://www.saucedemo.com/");
    }

    public void hitApiGetListUsers() {
        response = getListUsers(setURL);
    }

    public void validationStatusCodeIsEquals(int status_code) {
        assertThat(response.statusCode()).isEqualTo(status_code);
    }
}
