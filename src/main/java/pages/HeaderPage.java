package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeaderPage extends BasePage {
    WebDriver driver;

    public HeaderPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    private final String alarmTale = "//span[contains(text(), 'Вживання')]";
    private final String diznaysaChomyButton = "//a[contains(@href, 'removing-the-russian-language')]";

    @FindBy(xpath = alarmTale)
    private WebElement alarmTaleElement;

    @FindBy(xpath = diznaysaChomyButton)
    private WebElement diznaysaChomyButtonElement;

    /**
     * Get 'Alarm' tale
     *
     * @return {@link WebElement}
     */
    public WebElement getAlarmTaleElement() {
        return alarmTaleElement;
    }

    public WebElement getDiznaysaChomyButtonElement() {
        return diznaysaChomyButtonElement;
    }
}