package com.automation_template.pages;

import com.automation_template.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
