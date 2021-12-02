import com.opencart.navigation.Navigation;
import com.opencart.steps.RegisterPageBL.HeaderPageBL;
import org.testng.annotations.Test;

import static com.opencart.enums.URLs.BASE_URL;

public class ChangePasswordTest extends BaseTest {

    @Test
    public void ChangePasswordPositive() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        HeaderPageBL headerPageBL = new HeaderPageBL();
        headerPageBL.OnMyAccountButtonClick()
                .OnLoginButtonClick()
                .ValidUserLogin()
                .getMyAccountPageBL()
                .myAccountPassChangeClick()
                .getPasswordChangeBL()
                .successfulChangePassword().verifyChangePassword();

    }

    @Test
    public void ChangePasswordNegative() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        HeaderPageBL headerPageBL = new HeaderPageBL();
        headerPageBL.OnMyAccountButtonClick()
                .OnLoginButtonClick()
                .ValidUserLogin()
                .getMyAccountPageBL()
                .myAccountPassChangeClick()
                .getPasswordChangeBL()
                .unsuccessfulChangePassword().verifyChangePasswordsNotMatch();

    }

}